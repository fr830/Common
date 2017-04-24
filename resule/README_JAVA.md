<h2 align = "center">韩迎龙个人简历</h2>

### 1.个人信息
* 姓名：韩迎龙(**Kencery**)、 性别：男、 现居住地：*北京*
* 毕业院校：长春工程学院
* 联系电话：**18658152123**、E-Mail：**hyl934532778@live.cn**
* 工作时间：2012年2月份->至今、工作年限：5年
* 博客：http://www.cnblogs.com/hanyinglong 、GitHub：https://github.com/kencery
* 求职意向：Java软件工程师

### 2.开源项目/博客
| 标题        | 地址           | 简要说明           |
| ------------- |:-------------:|:-------------:|
| 全文检索系列博客 |  [全文检索系列博客](http://www.cnblogs.com/hanyinglong/p/5464604.html,"全文检索系列博客")   | 基于Lucene的Elasticsearch全文检索(安装-集群-Java_API),并且使用在日志中|
| 开源权限系列博客 |  [开源权限系列博客](http://www.cnblogs.com/hanyinglong/archive/2013/03/22/2976478.html "开源权限系列博客")   | 自己编写的一个开源权限系统(用户-组-角色-权限-按钮)，从无到有的的实现并且博客分享 |
| 初心网 |  [初心网](http://www.chuxinm.com "初心网")   | 带领团队开发的一套博客－源码买卖商城，业务内容及框架编写均由我完成 |

### 3.个人技能
* 熟练掌握Java语法糖、Spring、Spring MVC、Shiro、MyBatis、JDBC、Hibernate、Spring Boot等
* 熟练使用Myeclipse、IDEA等开发工具并且使用Maven开发项目及发布部署到服务器
* 可以搭建基于Spring MVC/Spring Boot、Memcached、Redis、Mysql/SqlServer等技术的网站框架
* 熟练使用Git、SVN、TFS等版本控制软件、熟练使用Linux系统常用操作命令
* 熟练掌握Sql Server、Mysql、MongoDB等数据库,对数据库的优化有一定的了解
* 熟练运用Redis、Memcached、Nginx、Elasticsearch、Email、Task服务、RabbitMQ等组件的使用
* 熟练掌握页面架构和布局,使用JavaScript和Jquery及第三方插件(EasyUI，Bootstrap...),了解DIV+CSS布局
* 可以搭建方便开发的各种开源工具：Raneto Docs、Swagger Api等
* 具有面向对象思想，扎实的编程功底以及良好的编码习惯
* 有开发.net、nodejs的经验

### 4.工作经历
| 工作时间          | 公司名称  | 在职职位      | 完成项目       |
| ----------------- |:-------------:|:-------------:|:-------------:|
| 2015/03-至今      | 北京易淘星空网络科技有限责任公司 | Java软件工程师 | boss收银系统、日志监控系统、社群系统、H5外卖网、MongoDB打印机日志查看系统、易淘餐厅运营后台 |
| 2013/02-2015/03   | 北京奥鹏教育集团 | .NET软件工程师/项目负责人 | 时代先锋网、教材信息系统V1.0、文档库管理系统 |
| 2012/02-2012/12   | 长春东高集团 | .NET软件工程师 | MVC权限管理信息系统(KJ240)、人员定位管理系统(KJ241) |

### 5.项目简述
#### (1)qtuc基础服务中心
* 项目介绍：为了适应多业务横向发展，不使其每个系统都写一遍相同的业务，因此产生了该系统，该系统封装了公司所有业务的基础信息并对外提供固定的接口，别的子系统对公共的内容只需从此项目调用，它们只需要实现自己固定的业务
* 项目职责
	* 使用Sping MVC＋MyBatis+Redis开发权限信息，将系统所有用户信息统一到基础下管理权限
	* 为系统配置Swagger2.0，将控制器下的接口对外提供展示
	* 使用Gradle管理项目包文件，使用Dubbo和Zookeeper管理Service
* 使用技术：Spring MVC、MySql、MyBatis、Dubbo、Zookeeper、事件、Shiro、Swagger2.0、logback、oauth等

#### (2)Boss收银系统(http://boss.etao.cn/)
* 项目介绍:该系统提供公司各个终端、销售人员、开发人员、财务等使用的基础系统，各个终端订单的管理，销售人员对各个终端的管理，开发人员对终端产品的推送以及财务的对账等功能(管理后台)
* 项目职责
	* 使用Spring MVC+Shiro+MyBatis+Redis开发用户权限模块，使系统能够对按钮进行权限级控制
	* 封装生成二维码的实现类，使其能够定制化门店桌台二维码的实现
	* 门店、订单管理,营收统计,佣金配置等基础功能的实现
	* 对订单和人员消费的各种统计以及报表的导出等Excel的封装
	* 多数据源的切换配置(使用Aop切面实现DataSource)
* 使用技术:Spring MVC、Mysql、Shiro、Ehcache、MyBatis、Spring(redis、rest、task)开源组件、Swagger、Log4j2、Email等

#### (3)易淘餐厅运营后台(https://a.etao.cn/)
* 项目介绍:该系统为公司内部和餐厅使用的一体化项目，面向于公司所有人使用，使用权限管理其数据展示等信息
* 项目职责
	* 使用Spring MVC+MyBatis+Druid+Redis开发系统
	* 主要设计权限模块，对权限模块采用层级控制级别，使其权限对外开放而不需要开发人员固定设置，只需要管理员的配置即可
	* 封装Java对MongoDB(Nosql数据库))的操作使其能够进行添加和查询的API
	* Redis服务器的部署以及封装使用的公共类实现
* 使用技术:Spring MVC、struts、JSP、MySql、Redis、MyBatis、Swagger、Log4j2等

#### (4)日志监控系统
* 项目介绍:该系统提供给公司内部使用，主要是监控公司所有网站的请求等日志信息以及订单号剩余量、订单数量、RabbitMQ、短信发送等信息。
* 项目职责
	* 搭建ElasticSearch集群并且将Mysql中的数据使用river同步ElasticSearch中
	* 使用SpringBoot开发系统并且封装ElasticSearch的公共类
	* 使用yml管理配置文件
	* 使用Java对ElasticSearch中的日志数据进行查询汇总的实现并且使用Redis对数据进行缓存
	* 使用Echarts来展现各种统计的图表信息
* 使用技术:SpringBoot、Elasticsearch、River、Redis、Echarts、Mysql

#### (5)初心网(http://www.chuxinm.com)
* 项目介绍:该系统为个人组织团队在业余时间开发的一个博客／商城系统(B2C)，系统基于.net core进行开发,部署在linux服务器上。
* 项目职责
	* 担任项目负责人，团队人员：7人
	* 考虑业务需求和数据库设计以及组织团队、搭建.net core项目框架、源码管理(源码放在开源中国下)和部署服务器
	* 设计权限管理(权限分为好多层的设计思路)、使用Redis对用户权限进行缓存
	* 将系统图片使用七牛云存放、定时任务使用TimeJob等来实现
	* 搭建架构并且实现功能性的数据库增删改查以及后台框架页面管理和前台页面的展示
* 使用技术:ASP.NET Core、MySql、AutoFac、Metronic框架、BootStrap、TimeJob、Wangeditor、ZTree、Redis、七牛云、UnitOfWork、MailKit邮件、Logging日志

#### (6)时代先锋网(http://mooc.zjsdxf.cn/)
* 项目介绍:该系统提供了公务员学习的平台,在此平台上可以学习课程(视频/文档/作业/考试/问卷调差),教师可以对学生的学习情况及作业、考试进行打分，管理员可以对教师及课程进行整体的管理和审核
* 项目职责
	* 系统分为三个级别(管理员/教师/学生),每个模块独立,我负责管理员模块的开发，实现了创建课程(设置课程/上传视频/课程共享)，分地管理以及问卷调差，对区域内教师的管理和课程学习的统计
	* 负责后期的Bug统计和修改以及和第三方公司的登录对接
	* 编写文档管理员的操作说明和整个系统的测试用例
* 使用技术:ASP.NET MVC、ADO.NET、Jquery插件、Win服务。

#### (7)MVC权限管理系统(KJ240) (开源)
* 项目介绍:该系统是为公司开发的通用权限系统，可以在每个项目的权限中直接使用,关于这个项目在开源博客中已分享
* 项目职责
	* 该系统是为了在以后的过程中不需要开发重复性的工作而使用MVC和EF开发的权限系统，可以在ASP.NET MVC和WebForm中使用。
	* 数据库设计和项目框架搭建，代码实现等全部由自己实现，参考博客园内容。
	* 完成为用户设置角色和权限，给权限设置角色，给用户设置用户组，最后使用MVC的OnActionExting方法来判断用户必须满足上述条件才能进行权限设置并且登录系统。
* 使用技术:ASP.NET MVC、EasyUI、Entity Framework、log4Net

### 6.自我评价
* 本人诚实谦虚，工作勤奋，认真负责，能吃苦耐劳，尽职尽责，有较强的团队精神和学习能力，对工作适应力非常强，能很快融入到公司工作中
* 有管理小型团队的经验

### 7.正在阅读的书籍
* 深入理解Java虚拟机...
* Spring 3.x 企业应用开发实战...
* Docker研究...
* Spring Boot+Spring Cloud微服务...
* MySql深层次学习...