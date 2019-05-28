package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/waqemhaq/Desktop/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com");
		driver.get("https://www.google.com");
		driver.get("https://www.amazon.com");

		System.setProperty("webdriver.gecko.driver", "/⁨Users/waqemhaq⁩/Desktop/⁨Selenium⁩/geckodriver");
	}

}
