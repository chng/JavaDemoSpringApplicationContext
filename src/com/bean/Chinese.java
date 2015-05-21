package com.bean;


public class Chinese extends Person
{

	String beanname;
	
	public Chinese()
	{
	}
	public Chinese(String name, int age)
	{
		setName(name);
		setAge(age);
	}
	
	public void show()
	{
		System.out.println("Chinese - " + name + " " + age);
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		name = name.toUpperCase();
		if(age<0) age = 0;
		else if(age>150) age = 150;
		System.out.println("BeanName: " + getBeanName());
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
}
