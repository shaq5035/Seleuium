package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/waqemhaq/Desktop/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.firstName")).sendKeys("Shaban");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.lastName")).sendKeys("Haq");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.address.street")).sendKeys(" blahhhh");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.address.city")).sendKeys("blahhh blahhhh");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.address.zipCode")).sendKeys("22590");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.phoneNumber")).sendKeys("5713398553");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.ssn")).sendKeys("222222222");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.username")).sendKeys("BonBon");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.password")).sendKeys("BonBon");
		Thread.sleep(2000);

		driver.findElement(By.id("repeatedPassword")).sendKeys("BonBon");
		Thread.sleep(2000);

		driver.findElement(By.className("button")).click();

		

	}

}
