1.公用类说明：此项目封装了我们在项目中用到的大部分公共类，并且每周我都会有新的公共类整理上传<br/>
2.关于项目中所有公共类的详细说明，请擦查看GitHub中此文档：DocumentationInfo.txt<br/>
3.想查看更多信息，请查看博客园：http:www.cnblogs.com/hanyinglong<br/>
4.ASP.NET MVC权限系列：http://www.cnblogs.com/hanyinglong/archive/2013/03/22/2976478.html<br/>
5.GIT学习笔记：http://www.cnblogs.com/hanyinglong/p/4396833.html<br/>
6.吃水不忘挖井人<br/>
备注：作者联系方式：18658152123，QQ技术群：159227188,QQ号：934532778，邮箱：hyl934532778@live.cn

说明文件：C#,ASP.NET，ASP.NET MVC公共(在每个项目中可以共用的类)类整理
1.Json对象转换
         (1):Json.NET对Json字符串转换成对象，对象转换成Json字符串
	(2):JavaScript对Json字符串转换成对象，对象转换成Json字符串
2.Linq扩展方法
	(1):扩展OrderBy方法，实现根据属性和顺序(倒序)进行排序
3.MsOffice转化Pdf图片PDF转换成图片
	(1):将Office系列软件(World)转换成PDF格式的文档和图片形式存放
4.MVC扩展方法
	(1):将对象(主要是匿名对象)转换为View层可以访问的对象(dynamic),ViewBag调用
5.Zip压缩通用类库
	(1):对原始文件进行压缩(压缩文件，文件夹，流)以及解压缩
6.操作Excel
	(1):使用NPOI导出Excel,传递的集合是List对象(实体集合)
	(2):使用NPOI导出Excel，传递的集合是DataTable对象(暂未实现)
7.读取WebConfig
	(1):读取WebConfig中AppSettings的信息和数据库连接字符串
8.对象转化器
	(1):将对象转换成List集合
9.枚举_下拉框(Enum)
	(1):对枚举进行读取和获取Description属性
	(2):将枚举值存放到下拉框中的实现
10.通用各种加密解密
	(1):对文件进行加密和解密
	(2)：其它加密算法(对称，Des,MD5，Hash1,Escape)
11.通用工具类
	(1):对字符串操作的封装
	(2):正则表达式验证字段信息
12.验证码(Drawing)
	(1):网站中一般验证码的实现
