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
	
	

}
