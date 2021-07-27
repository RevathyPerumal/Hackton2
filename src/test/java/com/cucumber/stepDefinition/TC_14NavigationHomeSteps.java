
package com.cucumber.stepDefinition;

import com.cucumber.base.BaseClass;
import com.cucumber.pages.TC_02LoginPage;
import com.cucumber.pages.TC_14NavigationBacktoHome;
import com.cucumber.utils.LoginData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_14NavigationHomeSteps extends BaseClass{
	BaseClass base;
	TC_14NavigationBacktoHome navigate;
	TC_02LoginPage login;
	LoginData log;
	

@Given("^Launch the chrome$")
public void launch_the_chrome() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	base = new BaseClass();
	base.initialization();
}

@When("^enter username and password for navigate$")
public void enter_username_and_password_for_navigate() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    login = new TC_02LoginPage();
    log = new LoginData();
    login.loginDetails(log.uid(), log.credpass());
}

@When("^click on ok$")
public void click_on_ok() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	  login = new TC_02LoginPage();
	  login.submit();
}

@Then("^enter the product$")
public void enter_the_product() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    navigate = new TC_14NavigationBacktoHome();
    navigate.product();
    navigate.homepage();
    base.Close();
}


}
