package com.demo.testcases;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.pageobjects.BaseClass;
import com.demo.pageobjects.CustomerPage;
import com.demo.pageobjects.LoginPage;

public class CustomerTest extends BaseClass {
	
	LoginPage objLogin;
	
	CustomerPage objCustomer;
	
	
@BeforeClass
	
	public void beforerun() {
		
		objLogin = new LoginPage(driver);
		
		objCustomer = new CustomerPage(driver);
		
		driver.navigate().to(objConfig.getPropertyvalue("baseUrl"));
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
	}


   @Test(priority=1)
   
   public void login() {
	   String uname= objConfig.getPropertyvalue("userName");
		
	   String passwrd= objConfig.getPropertyvalue("passWord");
	   
	   objLogin.enterCredential(uname, passwrd);
	   
   }
   
   @Test(priority=2)
   public void validateNewcustomerPage() throws InterruptedException {
	   
	   
	    String expectedurl=testDataConfig.getPropertyvalue("newCustomerPage");
		
		String expectedheader= testDataConfig.getPropertyvalue("newCutsomerPageHeader");
		
		
		
		if (objCustomer.newCustomerpage(expectedurl,expectedheader)){
			
			assertTrue(true);
		}else {
			
			assertTrue(false);
		}
	   
	   
	   
   }
	
	

}
