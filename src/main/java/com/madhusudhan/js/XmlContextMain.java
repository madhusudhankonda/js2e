package com.madhusudhan.js;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlContextMain {

	private ClassPathXmlApplicationContext ctx = null;
	
	public XmlContextMain() {
		ctx = new ClassPathXmlApplicationContext("basics-beans.xml");
	}
	public void test(){
		MessageService msgServiceImpl = ctx.getBean("msgService",MessageService.class);
		System.out.println(""+msgServiceImpl.getMessage());
	}
	
	public static void main(String[] args) {
		new XmlContextMain().test();
	}

}
