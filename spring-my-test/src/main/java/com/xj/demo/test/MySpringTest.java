package com.xj.demo.test;


import com.xj.demo.bean.UserBean;
import com.xj.demo.context.MySpringContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MySpringTest {
	public static void main(String[] args) {
		MySpringContext context = new MySpringContext("classpath:bean.xml");
		UserBean bean = context.getBean(UserBean.class);
	}
}
