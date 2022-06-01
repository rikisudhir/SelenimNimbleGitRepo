package com.demo.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.util.UIControlActions;

public class LoginPage {
	
	WebDriver driver;
	UIControlActions uiobj;
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	
		
		uiobj = new UIControlActions(driver);
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(name="uid")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement passWd;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(className="heading3")
	WebElement FlashMsg;
	
	@FindBy(xpath ="//a[@href='Logout.php']")
	WebElement LogoutLink;
	
	
	
	/* Function: enterCredential
	 * Paramemters: username, password
	 * Description: This method is to enter credentials
	 * Author: Sudhir
	 * Date: 19-05-2022
	 */
	
	
	public void enterCredential(String username, String password) {
		
		try {
			
		
		userName.sendKeys(username);
		
		passWd.sendKeys(password);
		
		loginBtn.click();
		
		Thread.sleep(5000);
		
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
	}
	
	
   public String validateflashMessage() {
		
		
		String actualflashMsg= FlashMsg.getText();
		
		return actualflashMsg;
		
	}
	

   public String  logout() throws InterruptedException, AWTException {
	   
	   
	   //Actions actions = new Actions(driver);
	// Page Down
	//actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	   
	   uiobj.scrolldown();
	   
	   Thread.sleep(2000);
	
	   System.out.println("test545");
	   
	   
	   Thread.sleep(2000);
	  
	   LogoutLink.click();
	   
	   Thread.sleep(2000);
	   
	   String alerttext= uiobj.getAlertText();
	   
	   uiobj.AcceptAlert();
	   
	   return alerttext;
	   
   }
   
   
	

}
	


