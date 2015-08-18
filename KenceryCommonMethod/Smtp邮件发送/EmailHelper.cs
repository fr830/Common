// 源文件头信息：
// <copyright file="Email.cs,EmailHelp.cs">
// Copyright(c)2014-2034 Kencery.All rights reserved.
// 个人博客：http://www.cnblogs.com/hanyinglong
// 创建人：韩迎龙(kencery)
// 创建时间：2015-8-18
// </copyright>

using System;
using System.Net;
using System.Net.Mail;
using System.Text;

namespace KenceryCommonMethod
{
    /// <summary>
    /// 功能：实现邮件发送,分装发送邮件的调用方法
    /// </summary>
    /// <auther>
    ///     <name>Kencery</name>
    ///     <date>2015-8-7</date>
    /// </auther>
    public class Email
    {
        #region  --------------------字段--------------------

        private string _serviceType = "SMTP";
        private string _host;

        #endregion

        #region  --------------------属性--------------------

        /// <summary>
        /// 发送者邮箱
        /// </summary>
        public string From { get; set; }

        /// <summary>
        /// 接收者邮箱列表
        /// </summary>
        public string[] To { get; set; }

        /// <summary>
        /// 抄送者邮箱列表
        /// </summary>
        public string[] Cc { get; set; }

        /// <summary>
        /// 秘抄者邮箱列表
        /// </summary>
        public string[] Bcc { get; set; }

        /// <summary>
        /// 邮件主题
        /// </summary>
        public string Subject { get; set; }

        /// <summary>
        /// 邮件内容
        /// </summary>
        public string Body { get; set; }

        /// <summary>
        /// 是否是HTML格式
        /// </summary>
        public bool IsBodyHtml { get; set; }

        /// <summary>
        /// 附件列表
        /// </summary>
        public string[] Attachments { get; set; }

        /// <summary>
        /// 邮箱服务类型(Pop3,SMTP,IMAP,MAIL等)，默认为SMTP
        /// </summary>
        public string ServiceType
        {
            get { return _serviceType; }
            set { _serviceType = value; }
        }

        /// <summary>
        /// 邮箱服务器，如果没有定义邮箱服务器，则根据serviceType和Sender组成邮箱服务器
        /// </summary>
        public string Host
        {
            get
            {
                return string.IsNullOrEmpty(_host)
                    ? (this.ServiceType + "." +
                       Sender.Split("@".ToCharArray(), StringSplitOptions.RemoveEmptyEntries)[1])
                    : _host;
            }
            set { _host = value; }
        }

        /// <summary>
        /// 邮箱账号(默认为发送者邮箱的账号)
        /// </summary>
        public string UserName { get; set; }

        /// <summary>
        /// 邮箱密码(默认为发送者邮箱的密码)，默认格式GB2312
        /// </summary>
        public string Password { get; set; }

        /// <summary>
        /// 邮箱优先级
        /// </summary>
        public MailPriority MailPriority { get; set; }

        /// <summary>
        ///  邮件正文编码格式
        /// </summary>
        public Encoding Encoding { get; set; }

        #endregion

        #region  ------------------调用方法------------------

        /// <summary>
        /// 构造参数，发送邮件，使用方法备注：公开方法中调用
        /// </summary>
        public void Send()
        {
            var mailMessage = new MailMessage();

            //读取To  接收者邮箱列表
            if (this.To != null && this.To.Length > 0)
            {
                foreach (string to in this.To)
                {
                    if (string.IsNullOrEmpty(to)) continue;
                    try
                    {
                        mailMessage.To.Add(new MailAddress(to.Trim()));
                    }
                    catch (Exception ex)
                    {
                        throw new Exception(ex.Message);
                    }
                }
            }
            //读取Cc  抄送者邮件地址
            if (this.Cc != null && this.Cc.Length > 0)
            {
                foreach (var cc in this.Cc)
                {
                    if (string.IsNullOrEmpty(cc)) continue;
                    try
                    {
                        mailMessage.CC.Add(new MailAddress(cc.Trim()));
                    }
                    catch (Exception ex)
                    {
                        throw new Exception(ex.Message);
                    }
                }
            }
            //读取Attachments 邮件附件
            if (this.Attachments != null && this.Attachments.Length > 0)
            {
                foreach (var attachment in this.Attachments)
                {
                    if (string.IsNullOrEmpty(attachment)) continue;
                    try
                    {
                        mailMessage.Attachments.Add(new Attachment(attachment));
                    }
                    catch (Exception ex)
                    {
                        throw new Exception(ex.Message);
                    }
                }
            }
            //读取Bcc 秘抄人地址
            if (this.Bcc != null && this.Bcc.Length > 0)
            {
                foreach (var bcc in this.Bcc)
                {
                    if (string.IsNullOrEmpty(bcc)) continue;
                    try
                    {
                        mailMessage.Bcc.Add(new MailAddress(bcc.Trim()));
                    }
                    catch (Exception ex)
                    {
                        throw new Exception(ex.Message);
                    }
                }
            }
            //读取From 发送人地址
            try
            {
                mailMessage.From = new MailAddress(this.From);
            }
            catch (Exception ex)
            {
                throw new Exception(ex.Message);
            }

            //邮件标题
            Encoding encoding = Encoding.GetEncoding("GB2312");
            mailMessage.Subject = string.Format("?={0}?B?{1}?=", encoding.HeaderName,
                Convert.ToBase64String(encoding.GetBytes(this.Subject), Base64FormattingOptions.None));
            //邮件正文是否为HTML格式
            mailMessage.IsBodyHtml = this.IsBodyHtml;
            //邮件正文
            mailMessage.Body = this.Body;
            mailMessage.BodyEncoding = this.Encoding;
            //邮件优先级
            mailMessage.Priority = this.MailPriority;

            //发送邮件代码实现
            var smtpClient = new SmtpClient
            {
                Host = this.Host,
                Credentials = new NetworkCredential(this.UserName, this.Password)
            };
            //认证
            try
            {
                smtpClient.Send(mailMessage);
            }
            catch (Exception ex)
            {
                throw new Exception(ex.Message);
            }
        }

        #endregion
    }

    /// <summary>
    /// 
    /// </summary>
    public static class EmailInfo
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="from"></param>
        /// <param name="to"></param>
        /// <param name="cc"></param>
        /// <param name="bcc"></param>
        /// <param name="subject"></param>
        /// <param name="body"></param>
        /// <param name="isBodyHtml"></param>
        /// <param name="attachments"></param>
        /// <param name="host"></param>
        /// <param name="password"></param>
        /// <returns></returns>
        public static bool SendEmail(string from, string[] to, string[] cc, string[] bcc, string subject, string body,
            bool isBodyHtml, string[] attachments, string host, string password)
        {
            var emil = new Email
            {
                From = @from,
                To = to,
                Cc = cc,
                Bcc = bcc,
                Subject = subject,
                Body = body,
                IsBodyHtml = isBodyHtml,
                Attachments = attachments,
                Host = host,
                Password = password
            };
            try
            {
                emil.Send();
                return true;
            }
            catch (Exception ex)
            {
                throw new Exception(ex.Message);
            }
        }
    }
}