package com.bean;

public class French extends Person{

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
}
