package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.CommonMethods;

public class RowVerifier extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Open chrome browser Go to
		 * “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.
		 * aspx” Login to the application Verify customer “Susan McLaren” is present in
		 * the table Click on customer details Update customers last name Verify updated
		 * customers name is displayed in table Close browser
		 */

		setUpDriver("chrome", "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");
		driver.findElement(By.cssSelector("#ctl00_MainContent_username")).sendKeys("Tester");
	    driver.findElement(By.cssSelector("#ctl00_MainContent_password")).sendKeys("test");
	    driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]")).click();
	    List<WebElement> rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
	    List<WebElement> columns=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[2]"));
	    String name="Susan McLaren";
	    for (int i=1; i<=rows.size(); i++) {
	        String rowText=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]")).getText();
	    
	        if(rowText.contains(name)) {
	        System.out.println("Contains name");
	        Thread.sleep(3000);
			driver.quit();
	        }
	    }}}
		
	


