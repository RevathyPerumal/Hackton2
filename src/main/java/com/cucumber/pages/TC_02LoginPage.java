package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.BaseClass;


public class TC_02LoginPage extends BaseClass {
	

	@FindBy(xpath="//a[@class='ltkpopup-close']")
	WebElement close;
	
	@FindBy(xpath ="//span[text()=\"Account\"]")
	WebElement account;
	
	@FindBy(xpath ="(//a[text()=\"My Account\"])[1]")
	WebElement myacc;
	
	@FindBy(xpath ="//input[@id='dwfrm_login_username']")
	WebElement user;
	
	@FindBy(xpath ="//input[@id='dwfrm_login_password']")
	WebElement passwd;
	
	@FindBy(xpath ="//input[@id='dwfrm_login_rememberme']")
	WebElement remember;
	
	@FindBy(xpath ="//span[text()=\"Log In\"]")
	WebElement log;
	
	public TC_02LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void loginDetails(String uname,String upass) throws InterruptedException {
		
		close.click();	
		account.click();
		myacc.click();
		Thread.sleep(5000);
		user.clear();
		user.sendKeys(uname);
		passwd.sendKeys(upass);
		close.click();
		remember.click();
		Thread.sleep(5000);
		
	}
	public void submit() throws InterruptedException {
		Thread.sleep(5000);
		log.click();
		
	}

}
