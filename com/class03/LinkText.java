package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "/Users/waqemhaq/Desktop/Selenium/chromedriver");
WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com");
Thread.sleep(3000);
driver.findElement(By.id("email")).sendKeys("shaq69897@gmail.com");
Thread.sleep(3000);

driver.findElement(By.id("pass")).sendKeys("Bec@use5");
Thread.sleep(3000);

driver.findElement(By.id("u_0_2")).click();
Thread.sleep(3000);

	}

}
