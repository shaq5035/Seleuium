package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/waqemhaq/Desktop/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://youtube.com");
		driver.get("http://gmail.com");
		driver.get("http://twitter.com");
		driver.get("http://google.com");
		driver.quit();
	}

}
