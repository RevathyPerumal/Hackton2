package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.BaseClass;

public class TC_14NavigationBacktoHome extends BaseClass{
	

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
	
	@FindBy(xpath ="//span[text()=\"SHOP NOW\"]")
	WebElement shop;
	
	@FindBy(xpath ="//p[text()=\"PENDANT LIGHTING\"]")
	WebElement light;
	
	@FindBy(xpath ="//p[text()=\"Medium & Large Pendants\"]")
	WebElement pendant;
	
	@FindBy(xpath ="//*[@id=\"6c68c799119a48c8f1eae33a9c\"]/div[1]/div[4]/a")
	WebElement lamp;
	
	@FindBy(xpath ="//a[@class=\"logo-link lu-sprite\"]")
	WebElement home;
	
	
public TC_14NavigationBacktoHome() {
	PageFactory.initElements(driver, this);
}
	
	public void loginDetails(String uname,String upass) throws InterruptedException {
		
		close.click();	
		account.click();
		myacc.click();
		user.clear();
		user.sendKeys(uname);
		passwd.sendKeys(upass);
		close.click();
		remember.click();
		Thread.sleep(5000);
		
	}
	public void submit() throws InterruptedException {
		log.click();
		Thread.sleep(5000);
	}
	public void product() throws InterruptedException {
		shop.click();
		Thread.sleep(5000);
		light.click();
		pendant.click();
		Thread.sleep(5000);
		lamp.click();
		
	}
	public void homepage() {
		home.click();
	}

}
