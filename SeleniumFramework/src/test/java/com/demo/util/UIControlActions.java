package com.demo.util;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class UIControlActions {
	
	WebDriver driver;
	
	public UIControlActions(WebDriver driver){
		
		this.driver=driver;
			
	}
	
	
	
	
	
	public String getAlertText() {
		
		Alert alert= driver.switchTo().alert();
			
		String alerttext= alert.getText();
		
		return alerttext;	
		
	}

	
	public void AcceptAlert() {
		
		Alert alert= driver.switchTo().alert();
		alert.accept();	
		
	}
}
