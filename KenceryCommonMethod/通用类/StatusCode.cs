// 源文件头信息：
// <copyright file="StatusCode.cs">
// Copyright(c)2014-2034 Kencery.All rights reserved.
// 个人博客：http://www.cnblogs.com/hanyinglong
// 创建人：韩迎龙(kencery)
// 创建时间：2015-6-11
// </copyright>
namespace KenceryCommonMethod
{
    /// <summary>
    /// 成功与否的枚举状态
    /// <auther>
    ///     <name>Kencery</name>
    ///     <date>2015-6-11</date>
    /// </auther>
    /// </summary>
    public enum Successed
    {
        /// <summary>
        /// 操作成功
        /// </summary>
        Ok = 200,

        /// <summary>
        /// 查询结果为空
        /// </summary>
        Empty = 201,

        /// <summary>
        /// 操作失败
        /// </summary>
        Error = 201
    }

    /// <summary>
    /// 系统错误信息
    /// <auther>
    ///     <name>Kencery</name>
    ///     <date>2015-6-11</date>
    /// </auther>
    /// </summary>
    public enum System
    {

    }

    /// <summary>
    /// 系统校验信息
    /// <auther>
    ///     <name>Kencery</name>
    ///     <date>2015-6-11</date>
    /// </auther>
    /// </summary>
    public enum Validate
    {

    }
}