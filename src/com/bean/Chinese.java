package com.bean;

public class Chinese extends Person{

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
}
