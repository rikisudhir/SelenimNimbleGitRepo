package com.testNG;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestNGDemo {
	
	
	@Test(priority = 1)
	public void Test3() {
		
		System.out.println("This is test1");
		
	}
	
	@Test(priority = 3)
	public void Test1() {
		
		
		System.out.println("This is test2");
		
	}
	
	@Test(priority = 2)
	public void Test2() {
		
		System.out.println("This is test3");
		
	}
	
	@Test
    public void test4() {
    	
    	System.out.println("This is my test4");
    }
	
	

}
