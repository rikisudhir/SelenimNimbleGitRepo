package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	
	@DataProvider (name = "data-provider")
    public Object[][] dpMethod(){
	 return new Object[][] {{"Sudhir"}, {"Swain"},{"Durga"},{1}};
    }
	
	@Test(dataProvider = "data-provider")
	public void test1(Object val) {
		
		System.out.println(val);
	}

}
