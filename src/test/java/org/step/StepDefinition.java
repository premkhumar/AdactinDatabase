package org.step;

import java.sql.SQLException;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends LibGlobal{
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		browserLaunchChrome();
		maxWindows();
		launchUrl("https://adactinhotelapp.com/");
		implicitWait(20);
	}

	@When("User enters Valid username and password")
	public void user_enters_Valid_username_and_password() throws ClassNotFoundException, SQLException {
	
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys(dbData("username"));
		System.out.println(dbData("Username"));
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(dbData("Password"));
	}

	@Then("Successfull Login and HomePage is visible")
	public void successfull_Login_and_HomePage_is_visible() {
	}


}
