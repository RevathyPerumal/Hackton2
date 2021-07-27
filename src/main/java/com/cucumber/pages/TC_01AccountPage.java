
package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.BaseClass;


public class TC_01AccountPage extends BaseClass {
	
	@FindBy(xpath="//a[@class='ltkpopup-close']")
	WebElement close;
	
	@FindBy(xpath ="//span[text()=\"Account\"]")
	WebElement account;
	
	@FindBy(xpath ="(//a[text()=\"My Account\"])[1]")
	WebElement myacc;
	
	@FindBy(xpath ="//input[@id='dwfrm_profile_customer_firstname']")
	WebElement firstname;
	
	@FindBy(xpath ="//input[@id='dwfrm_profile_customer_lastname']")
	WebElement lastname;
	
	@FindBy(xpath ="//input[@id='dwfrm_profile_customer_email']")
	WebElement email;
	
	@FindBy(xpath ="//input[@id='dwfrm_profile_customer_emailconfirm']")
	WebElement confemail;
	
	@FindBy(xpath ="//input[@id='dwfrm_profile_login_password']")
	WebElement passwd;
	
	@FindBy(xpath="//input[@id='dwfrm_profile_login_passwordconfirm']")
	WebElement confpass;
	
	@FindBy(xpath="//span[text()=\"Create Account\"]")
	WebElement create;
	
	public TC_01AccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void AccountCreate() throws InterruptedException {
		close.click();
		account.click();
		myacc.click();
		close.click();
		Thread.sleep(5000);
	}
	public void enterDetails(String fname,String lname,String emailid,String confemailid,String pass,String confpasswd) {
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		email.sendKeys(emailid);
		confemail.sendKeys(confemailid);
		passwd.sendKeys(pass);
		confpass.sendKeys(confpasswd);
		create.click();
		
	}
	public void createacc() {
		create.click();
	}
	
	

}
