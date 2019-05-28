package com.class07;

import org.openqa.selenium.By;

import methods.CommonMethods;

public class WindowTask extends CommonMethods{

	public static void main(String[] args) {
CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");

String parent=driver.getTitle();
String parentId=driver.getWindowHandle();
System.out.println("Title "+parent+" and Id "+parentId);
driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
String child=driver.getTitle();
String childId=driver.getWindowHandle();



	}

}
