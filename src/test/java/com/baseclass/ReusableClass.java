package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReusableClass {

	public static WebDriver driver;

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\UbuyProject\\Driver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		driver = new ChromeDriver(co);
	}

	public static void launchURL(String s1) {
		driver.get(s1);
		driver.manage().window().maximize();
	}

}
