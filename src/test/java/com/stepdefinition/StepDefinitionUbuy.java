package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.baseclass.ReusableClass;

import io.cucumber.java.en.*;

public class StepDefinitionUbuy extends ReusableClass {

	@Given("User is on UBUY login page")
	public void user_is_on_UBUY_login_page() {
		launchBrowser();
		launchURL("https://www.ubuy.co.in/");

	}

	@When("User has enter {string} and {string} and Click Login button")
	public void user_has_enter_and_and_Click_Login_button(String string, String string2) {
		try {
			driver.findElement(By.xpath("//*[@class='fas fa-times popup-v2 ub-newsletter-dismiss']")).click();
		} catch (Exception e) {
			driver.findElement(By.xpath("//*[@class='fas fa-times-circle']")).click();
		}
	}

	@When("User has enter the product and Enter")
	public void user_has_enter_the_product_and_Enter() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement txtSearch = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
		txtSearch.click();
		//txtSearch.sendKeys("iphone 11 " + Keys.ENTER);
		
		js.executeScript("arguments[0].setAttribute('value','iphone 11')", txtSearch);
		}

	@When("User should click the product and increse quantity")
	public void user_should_click_the_product_and_increse_quantity() {
	}

	@When("User should click Add to cart button")
	public void user_should_click_Add_to_cart_button() {
	}

	@When("User should click confirmation of product")
	public void user_should_click_confirmation_of_product() {
	}

}
