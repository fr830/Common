// 源文件头信息：
// <copyright file="RedisHelper.cs">
// Copyright(c)2014-2034 Kencery.All rights reserved.
// 个人博客：http://www.cnblogs.com/hanyinglong
// 创建人：韩迎龙(kencery)
// 创建时间：2015-8-18
// </copyright>


using System;
using System.Collections.Generic;
using System.Configuration;
using System.Security.Policy;
using NPOI.OpenXml4Net.OPC;
using ServiceStack.Redis;

namespace KenceryCommonMethod
{
    /// <summary>
    /// Redis缓存读取设置  封装
    /// <auther>
    ///     <name>Kencery</name>
    ///     <date>2015-8-18</date>
    /// </auther>
    /// </summary>
    public static class RedisHelper
    {
        /// <summary>
        /// 创建Redis连接池管理对象(添加ServiceStack.Interfaces.dll、ServiceStack.Redis.dll)
        /// </summary>
        /// <param name="readWriteHosts">只写服务器</param>
        /// <param name="readOnlyHosts">只读服务器</param>
        /// <returns></returns>
        private static PooledRedisClientManager CreateRedisManager(string[] readWriteHosts, string[] readOnlyHosts)
        {
            //支持读写分离，均衡负载
            return new PooledRedisClientManager(readWriteHosts, readOnlyHosts, new RedisClientManagerConfig
            {
                MaxWritePoolSize = 5, //“写”链接池数
                MaxReadPoolSize = 5, //“读”链接池数
                AutoStart = true,
            });
        }

        /// <summary>
        /// 调用CreateRedisManager方法，创建连接池管理对象,Redis服务器地址在配置文件中配置
        /// <add key="RedisHosts" value="127.0.0.1:6379" />
        /// </summary>
        private static PooledRedisClientManager _prcm = CreateRedisManager(
            ConfigurationManager.AppSettings["Hosts"].Split(",".ToCharArray(), StringSplitOptions.RemoveEmptyEntries),
            ConfigurationManager.AppSettings["Hosts"].Split(",".ToCharArray(), StringSplitOptions.RemoveEmptyEntries));

        /// <summary>
        /// 给缓存中添加数据，使用：RedisHelper.Set(key,值(需要存放的值));
        /// </summary>
        /// <typeparam name="T">缓存类型</typeparam>
        /// <param name="key">键</param>
        /// <param name="val">值</param>
        public static void Set<T>(string key, T val)
        {
            using (IRedisClient rdc = _prcm.GetClient())
            {
                rdc.Set<T>(key, val);
            }
        }

        /// <summary>
        /// 读取缓存中的数据，使用：var result=RedisHelper.Get<T>(key);
        /// </summary>
        /// <typeparam name="T">返回读取的数据</typeparam>
        /// <param name="key">键</param>
        /// <returns></returns>
        public static T Get<T>(string key) where T : class
        {
            using (IRedisClient rdc = _prcm.GetReadOnlyClient())
            {
                return rdc.Get<T>(key);
            }
        }

        /// <summary>
        /// 删除缓存中的数据，使用  RedisHelper.Remove(key);
        /// </summary>
        /// <param name="key">键</param>
        public static void Remove(string key)
        {
            using (IRedisClient rdc = _prcm.GetClient())
            {
                rdc.Remove(key);
            }
        }

        /// <summary>
        /// 缓存中是否包含查询的键数据，使用 var isTrue=RedisHelper.ContainsKey(key);
        /// </summary>
        /// <param name="key">键</param>
        /// <returns>如果包含，返回true,否则返回false</returns>
        public static bool ContainsKey(string key)
        {
            using (IRedisClient rdc = _prcm.GetReadOnlyClient())
            {
                return rdc.ContainsKey(key);
            }
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="key"></param>
        /// <param name="value"></param>
        public static void Add(string key, object value)
        {
            using (IRedisClient rdc = _prcm.GetClient())
            {
                if (!rdc.ContainsKey(key))
                {
                    rdc.Add(key, value, DateTime.Now.AddMinutes(30));
                }
                else
                {
                    rdc.Set(key, value);
                }
            }
        }

        /// <summary>
        /// 
        /// </summary>
        /// <typeparam name="T"></typeparam>
        /// <param name="key"></param>
        /// <returns></returns>
        public static Void RefreshCache<T>(string key) where T : class
        {
            using (IRedisClient rdc = _prcm.GetClient())
            {
                var value = rdc.Get<T>(key);
                rdc.Remove(key);
                rdc.Set<T>(key, value);
            }
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="keys"></param>
        /// <returns></returns>
        public static Dictionary<string, string> GetList(List<string> keys)
        {
            using (IRedisClient rdc = _prcm.GetReadOnlyClient())
            {
                return rdc.GetValuesMap<string>(keys);
            }
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="values"></param>
        public static void Set(Dictionary<string, string> values)
        {
            using (IRedisClient rdc = _prcm.GetReadOnlyClient())
            {
                rdc.SetAll(values);
            }
        }

    }
}