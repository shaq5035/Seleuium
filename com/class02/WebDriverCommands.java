package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/waqemhaq/Desktop/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("google")) {
			System.out.println("this is the right title");
		} else {
			System.out.println("this is the wrong title");

		}

		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		String title1 = driver.getTitle();
		if (title1.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
			System.out.println("this is the right title");
		} else {
			System.out.println("this is the wrong title");

		}
		driver.get("http://youtube.com");
		System.out.println(driver.getTitle());
		String title2 = driver.getTitle();
		if (title2.equalsIgnoreCase("youtube")) {
			System.out.println("this is the right title");
		} else {
			System.out.println("this is the wrong title");

		}
	}
}
