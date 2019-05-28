package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithFacebook {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "/Users/waqemhaq/Desktop/Selenium/chromedriver");
WebDriver driver=new ChromeDriver();

driver.get("https:facebook.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[starts-with(@type,'email')]")).sendKeys("shaq69897@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Bec@use5");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[contains(@value,'Log In')]")).click();
Thread.sleep(2000);
driver.close();
	}

}
