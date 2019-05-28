package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabTest {
	public static String user = "standard_user";
	public static String pass = "secret_sauce";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/waqemhaq/Desktop/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.saucedemo.com");
		Thread.sleep(2000);
		WebElement userName = driver.findElement(By.cssSelector("input[id*='user-name']"));
		userName.sendKeys(user);
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.cssSelector("input[id*='password']"));
		password.sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class* ='btn_action']")).click();

	boolean image=	driver.findElement(By.cssSelector("div[class='peek']")).isDisplayed();
	boolean product=	driver.findElement(By.cssSelector("div[class='product_label']")).isDisplayed();
		
	if(image) {
		System.out.println("Robot is displayed");
	}else {
		System.out.println("Robot is NOT displayed");

	}
	if (product) {
		System.out.println(product+" is displayed");

	}else {
		System.out.println(product+" is NOT displayed");

	}
		driver.quit();
	}

}
