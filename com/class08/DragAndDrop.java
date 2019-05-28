package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import methods.CommonMethods;

public class DragAndDrop extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "https://jqueryui.com/droppable/");
		WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
driver.switchTo().frame(frame);
Actions action =new Actions(driver);

WebElement drag= driver.findElement(By.cssSelector("div#draggable"));
WebElement drop= driver.findElement(By.cssSelector("div#droppable"));
action.dragAndDrop(drag, drop).perform();
Thread.sleep(2000);

driver.close();
	}

}
