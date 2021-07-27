package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.base.BaseClass;

public class TC_15InvalidZipCode extends BaseClass {
	
	@FindBy(xpath ="(//button[text()=\"ADD TO CART\"])[1]")
	WebElement add;
	
	@FindBy(xpath ="//a[text()=\"CHECKOUT\"]")
	WebElement checkout;
	
	@FindBy(xpath ="(//button[@name='dwfrm_cart_checkoutCart'])[1]")
	WebElement secureCheck;
	
	@FindBy(xpath ="//a[text()=\"EDIT\"]")
	WebElement edit;
	
	@FindBy(xpath ="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_postal']")
	WebElement postalcode;
	
	@FindBy(xpath ="//span[text()=\"Please check your postal code\"]")
	WebElement errormessg;
	/*
	@FindBy(xpath ="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_email']")
	WebElement email;
	
	@FindBy(xpath ="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_firstName']")
	WebElement firstname;
	
	@FindBy(xpath ="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_lastName']")
	WebElement lastname;
	
	@FindBy(xpath ="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_address1']")
	WebElement address;
	
	@FindBy(xpath ="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_city']")
	WebElement city;
	
	@FindBy(xpath ="//select[@id='dwfrm_singleshipping_shippingAddress_addressFields_states_stateUS']")
	WebElement state;
		
	@FindBy(xpath ="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_postal']")
	WebElement postalCode;
	
	@FindBy(xpath ="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_phone']")
	WebElement phone;
	
	@FindBy(xpath ="//span[text()=\"SAVE & CONTINUE\"]")
	WebElement save;
	*/
	
	public TC_15InvalidZipCode() {
		PageFactory.initElements(driver, this);
	}
		
	public void addtocart() throws InterruptedException {
		add.click();
		checkout.click();
		Thread.sleep(5000);
		secureCheck.click();
	}
	
	/*public void entercartDetails(String emailid,String fname,String lname,String add,String citys,String zip,String phonenum) {
		email.sendKeys(emailid);
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		address.sendKeys(add);
		city.sendKeys(citys);
		state.sendKeys(null);
		Select sel= new Select(state);
		sel.selectByVisibleText("New York");
		postalCode.sendKeys(zip);
		phone.sendKeys(phonenum);
		save.click();
	}
	*/
	public void postal() {
		edit.click();
		postalcode.clear();
		postalcode.sendKeys("100189");
		String error = errormessg.getText();
		System.out.println(error);
	}
	

}
