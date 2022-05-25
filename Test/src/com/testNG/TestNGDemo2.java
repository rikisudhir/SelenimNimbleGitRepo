package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo2 {
	
	
	@DataProvider (name = "data-provider")
    public Object[][] dpMethod(){
	 return new Object[][] {{"Sudhir"}, {"Swain"},{"Durga"}};
    }
	
	
	
	
	@Test (dataProvider = "data-provider")
    public void myTest (String val) {
        System.out.println("Passed Parameter Is : " + val);
    }
	
	
	

}
