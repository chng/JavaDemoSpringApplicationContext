package com.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public abstract class Person implements BeanNameAware, InitializingBean
{

	String name;
	int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age)
	{
		if(age>=0) this.age = age;
	}
	
	public void setName(String name)
	{
		if(name!=null) this.name=name;
	}
	
	public void show()
	{
		
	}
}
