package com.demo.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.util.UIControlActions;

public class CustomerPage {
	
	
	
	
	WebDriver driver;
	UIControlActions uiobj;
	
	
	public CustomerPage(WebDriver driver) {
		
		this.driver=driver;
		
		uiobj = new UIControlActions(driver);
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	@FindBy(xpath="//p[@class='heading3']")
	WebElement headerTxt;
	
	@FindBy(linkText ="New Customer")
	WebElement newCustomeLink;
	
	@FindBy(name ="name")
	WebElement customerName;
	
	@FindBy(id ="dob")
	WebElement dobElement;
	
	@FindBy(name ="addr")
	WebElement addressElement;
	
	@FindBy(name ="city")
	WebElement cityElement;
	
	@FindBy(name ="state")
	WebElement stateElement;
	
	@FindBy(name ="pinno")
	WebElement pinElement;
	
	@FindBy(name ="telephoneno")
	WebElement mobileNumberElement;
	
	@FindBy(name ="emailid")
	WebElement emailElement;
	
	@FindBy(name ="password")
	WebElement passwordElement;
	
	@FindBy(xpath ="//input[@value='Submit']")
	WebElement submitBtn;
	
	@FindBy(className ="heading3")
	WebElement successHeader;
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean newCustomerpage(String expectedurl,String expectedheader ) throws InterruptedException {
		
		
		
		boolean result =false;
		
		newCustomeLink.click();
		
		Thread.sleep(5000);
		
		String actualurl= driver.getCurrentUrl();
		
		String actualheadertext= headerTxt.getText();
		
		System.out.println(actualurl);
		
		System.out.println(actualheadertext);
		
		
		
		if(actualurl.equals(expectedurl) && actualheadertext.equals(expectedheader)) {
			
			result= true;
			
		}else {
			
			result = false;
		}
		
		return result;
		
		
	}
	
	public String submitCustomerDetails(String customername,String dob, String address, String city, String state,String pin, String mobile, String email, String password) throws InterruptedException {
		
		customerName.sendKeys(customername);
		
		dobElement.sendKeys(dob);
		
		addressElement.sendKeys(address);
		
		cityElement.sendKeys(city);
		
		cityElement.sendKeys(city);
		
		stateElement.sendKeys(state);
		
		pinElement.sendKeys(pin);
		
		mobileNumberElement.sendKeys(mobile);
		
		emailElement.sendKeys(email);
		
		passwordElement.sendKeys(password);
		
		
		
		submitBtn.click();
		
		Thread.sleep(4000);
		
		
		String actualsuccessmsg= successHeader.getText();
		
		return actualsuccessmsg;
		
		
		
		
		

	}

}
