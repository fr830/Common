// 源文件头信息：
// <copyright file="LoginAttribute.cs">
// Copyright(c)2014-2034 Kencery.All rights reserved.
// 个人博客：http://www.cnblogs.com/hanyinglong
// 创建人：韩迎龙(kencery)
// 创建时间：2015-8-7
// </copyright>

using System;
using System.Web.Mvc;

namespace KenceryCommonMethod
{
    /// <summary>
    /// <auther>
    ///     <name>Kencery</name>
    ///     <date>2015-8-7</date>
    /// </auther>
    /// </summary>
    [AttributeUsage(AttributeTargets.Method | AttributeTargets.Class, Inherited = true, AllowMultiple = true)]
    public class LoginAttribute : FilterAttribute, IAuthorizationFilter
    {
        public void OnAuthorization(AuthorizationContext filterContext)
        {
            throw new global::System.NotImplementedException();
        }
    }
}