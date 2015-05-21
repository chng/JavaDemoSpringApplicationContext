package com.bean;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UnitTest {

	Person p = null;
	
	@Before
	public void setUp() throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		p = (Person) context.getBean("chinese");
	}

	@Test(timeout = 1000)
	public void testShow() {
		p.show();
	}

	@Test(timeout = 1000)
	public void testChinese() {
		assert p!=null;
	}

	@Test(timeout = 1000)
	public void testChineseStringInt() {
		System.out.println(p);
		assert p!=null && p.getAge()!=0;
	}

	@Test(timeout = 1000)
	public void testSetAge() {
		p.setAge(99);
		testGetAge();
	}

	@Test(timeout = 1000)
	public void testSetName() {
		p.setName("ohoho");
		testGetName();
	}

	@Test(timeout = 1000)
	public void testGetName() {
		assert p!=null && p.getName()!=null;
		System.out.println(p.getName());
	}

	@Test(timeout = 1000)
	public void testGetAge() {
		assert p!=null && p.getAge()!=0;
		System.out.println(p.getAge());
	}

}
