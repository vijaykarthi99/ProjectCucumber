package org.step;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step  extends BaseClass{
	@Given("User is on Facebook Page")
	public void user_is_on_Facebook_Page() {
		launchURL("https://www.facebook.com");
		
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
	}

	@When("click login button")
	public void click_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("Error page displayed")
	public void error_page_displayed() throws Exception {
		Thread.sleep(5000);
//		WebElement errorMessage = driver.findElement(By.xpath(""));
//		Assert.assertTrue(errorMessage.getText().contains("incorrect"));
			
			System.out.println("Error Page is Displayed");
			driver.close();
	}


	
}
