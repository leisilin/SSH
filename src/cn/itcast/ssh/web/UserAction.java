package cn.itcast.ssh.web;

import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.ssh.domain.UserModel;
import cn.itcast.ssh.service.userebi.UserService;

public class UserAction extends ActionSupport{
	
	public UserModel userModle = new UserModel();
	//注入service接口
	private UserService userService;
	//需要注入
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String save(){
		System.out.println("action层的save==="+userModle.getName()+"  "+userModle.getAge());
		userService.save(userModle);
		return "ok";
//		System.out.println(um.getName());
//		System.out.println(um.getAge());
		/*
		//1.直接获取spring的资源
		//优点：与前期学习格式完全相同，相对来说掌握简单
		//缺点：每次加载配置都要读取配置文件，文件IO过程速度比较慢，因此不推荐使用这种资源初始化方式
		//问题：资源加载的次数太多，速度较慢，降低资源加载次数
		//解决方案：1次加载以后直接使用，在服务器启动时加载
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserEbi userEbi = (UserEbi) ctx.getBean("userEbi");
		*/

		/*
		//2.在服务器启动时加载资源
		//使用监听器完成资源的初始化工作
//		在服务器启动时，监测当前有没有初始化，如果没有
//		加载对应位置的配置文件（<param-name>contextConfigLocation</param-name>
//		<param-value>classpath:applicationContext.xml</param-value>）
//		加载完毕后，创建ApplicationContext对象，将该对象放置在了一个所有请求都可以获取到的地方（ServletContext）
//		以后使用，直接获取
		//优点：加载的次数减少，整体性能提高
		//缺点：当前创建的struts对应的Action类的对象是由struts2控制，并且资源使用时，不是采用注入形式，对象管理松散
		//解决方案：最好资源从spring的环境中获取，而不是手工的方法获取
		ServletContext sc = ServletActionContext.getServletContext();
		WebApplicationContext wctx = WebApplicationContextUtils.getWebApplicationContext(sc);
		UserEbi userEbi = (UserEbi) wctx.getBean("userEbi");
		*/

		/*
		//3.采用注入的形式完成资源的加载
		//struts-spring-plugin 插件开启了struts使用spring作为对象工厂的设置
		//当开启了该设置，struts2默认按照名称为其action对象注入资源，只要提供对应名称的bean，该对象就会自动装配进去
		//优点：格式简化了，不用初始化ApplicationContext对象，然后getBean....
		//缺点：当前的struts的action对象让然是struts自己创建
		//问题：资源的控制权有点松散
		//解决方案：将struts的action对象配置为spring的bean
		*/

		//4.采用spring控制action类的创建
		//将struts的action类配置成spring的bean，同时注入业务层接口
		//在struts.xml中使用伪类名（spring的beanid）定义action对象
		//优点：对象的控制更加集中在spring端
		//缺点：没有缺点

	}
	
}
