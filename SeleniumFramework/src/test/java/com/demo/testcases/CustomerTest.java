package com.demo.testcases;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.testng.annotations.AfterClass;
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
   
   
   @Test(priority=3)
   public void validateCreationofNewcustomerPage() throws InterruptedException {
	   
	   
	    String customername=testDataConfig.getPropertyvalue("customerName");
		String dob=testDataConfig.getPropertyvalue("dateOfBirth");
	    String address=testDataConfig.getPropertyvalue("address");
	    String city=testDataConfig.getPropertyvalue("city");
	    String state=testDataConfig.getPropertyvalue("state");
	    String pincode=testDataConfig.getPropertyvalue("pin");
	    String mobile=testDataConfig.getPropertyvalue("mobile");
	    String email=testDataConfig.getPropertyvalue("email");
	    String password=testDataConfig.getPropertyvalue("password");
	    
	    String expectedsuccessmsg= testDataConfig.getPropertyvalue("newCustomerSucessMsg");
	    
		
		String actualsuccessmsg= objCustomer.submitCustomerDetails(customername, dob, address, city, state, pincode, mobile, email, password);
		
		if(expectedsuccessmsg.equals(actualsuccessmsg)) {
			
			assertTrue(true);
		}else {
			
			assertTrue(false);
		}
	   
	   
   }
	
   @AfterClass		
	public void closebrowser() {
		
		driver.quit();
	}
	
	

}
