package com.cucumber.stepDefinition;

import com.cucumber.base.BaseClass;
import com.cucumber.pages.TC_02LoginPage;
import com.cucumber.pages.TC_14NavigationBacktoHome;
import com.cucumber.pages.TC_15InvalidZipCode;
import com.cucumber.utils.LoginData;
import com.cucumber.utils.ZipcodeData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_15InvalidZipCodeSteps {
	BaseClass base;
	TC_14NavigationBacktoHome navigate;
	TC_02LoginPage login;
	LoginData log;
	TC_15InvalidZipCode zip;
	ZipcodeData zipdata;
	
	
	@Given("^Launch the website for invalid zip$")
	public void launch_the_website_for_invalid_zip() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		base = new BaseClass();
		base.initialization();
	}

	@When("^enter the username and password for invalid zip$")
	public void enter_the_username_and_password_for_invalid_zip() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    login = new TC_02LoginPage();
	    log = new LoginData();
	    navigate = new TC_14NavigationBacktoHome();
	    navigate.loginDetails(log.uid(), log.credpass());
		navigate.submit();
	}

	@When("^enter the product details$")
	public void enter_the_product_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 navigate = new TC_14NavigationBacktoHome();
		    navigate.product();
	}

	@When("^the product is added to cart$")
	public void the_product_is_added_to_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 zip = new TC_15InvalidZipCode();
	 zipdata = new ZipcodeData();
	 zip.addtocart();
	}

	@Then("^enter the cart details$")
	public void enter_the_cart_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 zip = new TC_15InvalidZipCode();
		 zipdata = new ZipcodeData();
		// zip.entercartDetails(zipdata.email(), zipdata.fname(), zipdata.lname(),
		//		 zipdata.add(), zipdata.citys(), zipdata.zip(), zipdata.phonenum());
		 zip.postal();
		 base.Close();
	}


}
