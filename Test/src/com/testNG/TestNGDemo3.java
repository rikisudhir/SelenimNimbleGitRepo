package com.testNG;

import org.testng.annotations.Test;

public class TestNGDemo3 {
	
	
	@Test(enabled=false)
	public void test1() {
		
		System.out.println("test123");
		
	}
	
	
	@Test
	
	public void test2() {
		
		System.out.println("This is test2");
	}

}
