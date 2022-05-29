package com.demo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		Thread.sleep(3000);
		
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
	}
	
	
public String validateflashMessage() {
		
		
		String actualflashMsg= FlashMsg.getText();
		
		return actualflashMsg;
		
	}
	

   public String  logout() throws InterruptedException {
	   
	   LogoutLink.click();
	   
	   Thread.sleep(2000);
	   
	   String alerttext= uiobj.getAlertText();
	   
	   uiobj.AcceptAlert();
	   
	   return alerttext;
	   
   }
   
   
	

}
	


