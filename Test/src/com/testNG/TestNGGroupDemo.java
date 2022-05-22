package com.testNG;

import org.testng.annotations.Test;

public class TestNGGroupDemo {
	
	
	@Test(groups= {"sanitytest"})
	public void test1() {
		
		System.out.println("This is my test1 method");
	}
	
     @Test(groups= {"smoketest"})
	public void test2() {
		
		System.out.println("This is my test2 method");
	}
     
     @Test(groups= {"sanitytest"})
 	public void test3() {
 		
 		System.out.println("This is my test3 method");
 	}
     
     @Test(groups= {"sanitytest"})
 	public void test4() {
 		
 		System.out.println("This is my test4 method");
 	}

}
