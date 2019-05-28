package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/waqemhaq/Desktop/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		Iterator<WebElement> list = allLinks.iterator();
		while(list.hasNext()) {
			String listText=list.next().getText();
			if(!listText.isEmpty()) {
				System.out.println(listText);
			}else {
				
			}
		}
		driver.quit();
	}

}
