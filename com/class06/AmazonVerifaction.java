package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonVerifaction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/waqemhaq/Desktop/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		
		WebElement dep=driver.findElement(By.cssSelector("select#searchDropdownBox"));
//		dep.click();
		Select select=new Select(dep);
		
		List<WebElement> list=select.getOptions();
		System.out.println("department size "+list.size());
		
		Iterator<WebElement> it= list.iterator();
		while(it.hasNext()) {
		String textList=it.next().getText();
		System.out.println(textList);
		}
		
		select.selectByVisibleText("Computers");
		Thread.sleep(3000);
		
		driver.quit();
	}

}
