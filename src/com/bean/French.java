package com.bean;

public class French extends Person// implements InitializingBean
{

	String beanname;
	/*
	public French()
	{
	}
	*/
	public French(String name, int age)
	{
		setName(name);
		setAge(age);
	}
	
	public void show()
	{
		System.out.println("French - " + name + " " + age);
	}

	public void init()
	{
		name = name.toUpperCase();
		if(age<0) age = 0;
		else if(age>150) age = 150;
	}

	public String getBeanName()
	{
		return beanname;
	}
	
	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		beanname = arg0;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		init();
		System.out.println("BeanName: " + getBeanName());
	}
}
