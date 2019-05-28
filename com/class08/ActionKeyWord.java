package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import methods.CommonMethods;

public class ActionKeyWord extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/");
		
	WebElement hover=	driver.findElement(By.xpath("//span[text()='Tutorial']"));
	Actions action=new Actions(driver);
	action.moveToElement(hover).click().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Software Testing Tutorial']")).click();
	Thread.sleep(2000);

	driver.close();
	
	}

}
