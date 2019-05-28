package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/waqemhaq/Desktop/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:facebook.com");
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("shaq69897@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Bec@use5");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		Thread.sleep(2000);
driver.close();
	}

}
