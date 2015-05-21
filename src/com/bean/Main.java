package com.bean;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		Person p = null;
		try{
			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
			p = (Person) context.getBean("chinese");
			p.show();
			p = (French) context.getBean("french");
			p.show();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
