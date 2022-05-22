package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annorationsdemo {
	
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("this is my before class");
	}
	
	@BeforeSuite
	public void beforesuite() {
		
		System.out.println("This is my before Suite");
	}
	
	@BeforeTest
	public void Setup() {
		
		System.out.println("This is my before test");
		
		
	}
	
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("this is my before method");
	}
	
	
	
	
	@Test
	public void Test1() {
		
		System.out.println("This is test1");
		
	}
	
	@Test
	public void Test2() {
		
		System.out.println("This is test2");
		
	}
	
	@Test
	public void Test3() {
		
		System.out.println("This is test3");
		
	}
	
	@AfterTest
	public void TearDown() {
		
		System.out.println("This is my after test");
		
		
	}
	
	@AfterSuite
    public void aftersuite() {
		
		System.out.println("This is my after Suite");
	}
	
	@AfterClass
	public void afterclass() {
		
		System.out.println("this is my after class");
	}
	
	@AfterMethod
	public void aftermethod() {
		
		System.out.println("this is my after method");
	}
	

}
