package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTour {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/waqemhaq/Desktop/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(500);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(500);
		driver.findElement(By.name("firstName")).sendKeys("Shaban");
		Thread.sleep(500);

		driver.findElement(By.name("lastName")).sendKeys("Haq");
		Thread.sleep(500);

		driver.findElement(By.name("phone")).sendKeys("5713389090");
		Thread.sleep(500);

		driver.findElement(By.name("userName")).sendKeys("blahblah@gmail.com");
		Thread.sleep(500);

		driver.findElement(By.name("address1")).sendKeys("1800 drive here rd");
		Thread.sleep(500);

		driver.findElement(By.name("city")).sendKeys("Hoodbridge");
		Thread.sleep(500);

		driver.findElement(By.name("state")).sendKeys("America");
		Thread.sleep(500);

		driver.findElement(By.name("postalCode")).sendKeys("29018");
		Thread.sleep(500);
driver.findElement(By.id("email")).sendKeys("IEatCock");
Thread.sleep(500);

driver.findElement(By.name("password")).sendKeys("Cock");
Thread.sleep(500);

driver.findElement(By.name("confirmPassword")).sendKeys("Cock");
Thread.sleep(500);

driver.findElement(By.name("register")).click();
Thread.sleep(3000);
driver.close();

	}

}
