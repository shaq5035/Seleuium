package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/waqemhaq/Desktop/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		System.out.println(driver.getTitle());
		String word=driver.getTitle();
		
		if(word.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("right title");
		}else {
			System.out.println("wrong title");

		}
		driver.close();
	}

}
