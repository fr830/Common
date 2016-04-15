// 源文件头信息：
// <copyright file="StringExtensionHelper.cs">
// Copyright(c)2014-2034 Kencery.All rights reserved.
// 个人博客：http://www.cnblogs.com/hanyinglong
// 创建人：韩迎龙(kencery)
// 创建时间：2015/01/14
// </copyright>

using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;

namespace KenceryCommonMethod
{
    /// <summary>
    /// 针对字符串的扩展方法(正则表达式)
    /// <auther>
    ///     <name>Kencery</name>
    ///     <date>2015/01/14</date>
    /// </auther>
    /// 修改记录：时间  内容  姓名
    ///     1.2015-04-29   添加和修改正则表达式的验证信息  Kencery
    /// </summary>
    public static class StringRegexHelper
    {
        /// <summary>
        /// 指定的正则表达式在传递过来的字符串中是否找到了匹配项
        /// </summary>
        /// <param name="value">搜索匹配项的字符串</param>
        /// <param name="pattern">匹配的正则表达式模式</param>
        /// <returns>如果正则表达式找到匹配项，则为true,否则为false</returns>
        public static bool IsMatch(this string value, string pattern)
        {
            return value != null && Regex.IsMatch(value, pattern, RegexOptions.IgnoreCase);
        }

        /// <summary>
        /// 在指定的输入字符串中搜索指定的正则表达式的第一个匹配项
        /// </summary>
        /// <param name="value">要搜索匹配项的字符串</param>
        /// <param name="pattern">要配的匹正则表达式对象</param>
        /// <returns>返回一个对象，包含有关匹配项的信息</returns>
        public static string Match(this string value, string pattern)
        {
            return value == null ? null : Regex.Match(value, pattern, RegexOptions.IgnoreCase).Value;
        }

        /// <summary>
        /// 在指定的输入字符串中搜索指定的正则表达式的所有匹配项的字符串集合
        /// </summary>
        /// <param name="value">要搜索匹配项的字符串</param>
        /// <param name="pattern">要匹配的正则表达式模式</param>
        /// <returns>返回一个集合，</returns>
        public static IEnumerable<string> Matchs(this string value, string pattern)
        {
            if (value == null)
            {
                return new string[] { };
            }
            MatchCollection matchCollection = Regex.Matches(value, pattern, RegexOptions.IgnoreCase);
            //使用Linq返回集合
            var linqCollection = from Match n in matchCollection
                                 select n.Value;
            return linqCollection;
        }

        #region----------------字符串正则表达式验证(Email,Ip,整数，Unicode,Url，身份证号，电话)----------

        /// <summary>
        /// 使用正则表达式验证是否是电子邮件
        /// </summary>
        public static bool IsEmail(this string value)
        {
            const string pattern = @"^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$";
            return value.IsMatch(pattern);
        }

        /// <summary>
        /// 使用正则表达式验证是否是IP地址
        /// </summary>
        public static bool IsIpAddress(this string value)
        {
            const string pattern =
                @"^(\d(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\d\.){3}\d(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\d$";
            return value.IsMatch(pattern);
        }

        /// <summary>
        /// 使用正则表达式验证是否整数
        /// </summary>
        public static bool IsNumeric(this string value)
        {
            const string pattern = @"^\-?[0-9]+$";
            return value.IsMatch(pattern);
        }

        /// <summary>
        /// 使用正则表达式验证是否Unicode字符串
        /// </summary>
        public static bool IsUnicode(this string value)
        {
            const string pattern = @"^[\u4E00-\u9FA5\uE815-\uFA29]+$";
            return value.IsMatch(pattern);
        }

        /// <summary>
        /// 使用正则表达式验证是否Url字符串
        /// </summary>
        public static bool IsUrl(this string value)
        {
            const string pattern =
                @"^(http|https|ftp|rtsp|mms):(\/\/|\\\\)[A-Za-z0-9%\-_@]+\.[A-Za-z0-9%\-_@]+[A-Za-z0-9\.\/=\?%\-&_~`@:\+!;]*$";
            return value.IsMatch(pattern);
        }

        /// <summary>
        /// 使用正则表达式验证是否是身份证，包含以下三种情况：
        ///     (1):身份证号码为15位数字
        ///     (2):身份证号码为18位数字
        ///     (3):身份证号码为17位数字+1个字母
        /// </summary>
        public static bool IsIdentityCard(this string value)
        {
            const string pattern = @"^(^\d{15}$|^\d{18}$|^\d{17}(\d|X|x))$";
            return value.IsMatch(pattern);
        }

        /// <summary>
        /// 使用正则表达式验证是否是身份证，包含以下三种情况：
        ///     (1):身份证号码为15位数字
        ///     (2):身份证号码为18位数字
        ///     (3):身份证号码为17位数字+1个字母
        /// </summary>
        /// <param name="value">传递需要验证的字符串信息</param>
        /// <param name="isInfo">重构，true，false暂时没有用到，不使用</param>
        /// <returns>返回验证是否通过的标志</returns>
        public static bool IsIdentityCard(this string value, bool isInfo)
        {
            if (string.IsNullOrEmpty(value))
            {
                return false;
            }

            //模式字符串
            var pattern = new StringBuilder();
            pattern.Append(@"^(11|12|13|14|15|21|22|23|31|32|33|34|35|36|37|41|42|43|44|45|46|");
            pattern.Append(@"50|51|52|53|54|61|62|63|64|65|71|81|82|91)");
            pattern.Append(@"(\d{13}|\d{15}[\dx])$");
            //验证身份证信息是否正确
            return Regex.IsMatch(value.Trim(), pattern.ToString());
        }

        /// <summary>
        /// 使用正则表达式验证是否是电话号码
        /// </summary>
        /// <param name="value"></param>
        /// <param name="isRestrict">是否按照严格的格式去验证</param>
        /// <returns></returns>
        public static bool IsMobileNumber(this string value, bool isRestrict = false)
        {
            string pattern = isRestrict ? @"^[1][3-8]\d{9}$" : @"^[1]\d{10}$";
            return value.IsMatch(pattern);
        }

        public static bool IsString(this string value)
        {
            return value.IsMatch("^[1-9]*[0-9]*$");
        }

        #endregion

    }
}