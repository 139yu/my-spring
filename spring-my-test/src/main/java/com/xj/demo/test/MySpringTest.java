package com.xj.demo.test;

import com.xj.demo.bean.UserBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
		UserBean bean = context.getBean(UserBean.class);
		System.out.println(bean);
	}
}
