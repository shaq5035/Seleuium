package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWorkFaceBook {

	public static void main(String[] args) {
//		month dd has 12 month options
		System.setProperty("webdriver.chrome.driver", "/Users/waqemhaq/Desktop/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com");
		Select obj;
		List<WebElement> options;
		WebElement month=driver.findElement(By.cssSelector("select[name=birthday_month]"));
		obj=new Select(month);
		options=obj.getOptions();
		System.out.println(options.size());
		obj.selectByIndex(6);
		
		
//		day dd has 31 day options
		WebElement day=driver.findElement(By.name("birthday_day"));
		obj=new Select(day);
		options=obj.getOptions();
		System.out.println(options.size());
		obj.selectByValue("14");
		
		
//		year dd has 115 year options
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		obj=new Select(year);
		options=obj.getOptions();
		System.out.println(options.size());
		obj.selectByVisibleText("2000");
		
		
		driver.quit();
	}
	}


