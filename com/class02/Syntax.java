package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Syntax {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/waqemhaq/Desktop/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.syntaxtechs.com");
		driver.get("http://www.google.com");
		driver.navigate().back();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		String word = driver.getTitle();
if (word.contains("Syntax")) {
	System.out.println("Right url");
}else {
	System.out.println("Wrong url");

}
driver.close();
	}

}
