package com.xj.demo.context;

import com.xj.demo.bean.MyBeanFactoryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringContext extends ClassPathXmlApplicationContext {
	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.customizeBeanFactory(beanFactory);
		super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
	}
	public MySpringContext(String configLocation) {
		super(configLocation);
	}
}
