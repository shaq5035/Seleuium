package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.CommonMethods;

public class TaskTableHeaders extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
/*
 * TC 1: Table headers and rows verification

Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Sortable Data Tables” link
Verify tables consist of 4 rows and 6 columns
Print name of all column headers
Print data of all rows
 */
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();
		
		List<WebElement> cols =driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		for(WebElement col:cols) {
			System.out.println("columns "+col.getText());
		}
		System.out.println();
	List <WebElement>rows=	driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		for(WebElement row:rows) {
			System.out.println("rows "+row.getText());
		}
		
		/*how to print value cell by cell
		 * 1. loop through all rows
		 * 2. loop through all cols
		 * 
		 * 	driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[rows]/td[cols]")).getText();
		 * */
			
		//1 way
		for(int i=1; i<=rows.size(); i++) {
			for (int j=1; j<=cols.size(); j++) {
				
				String cellText=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(cellText);
			}
		}
		//2 way
		System.out.println("---------------------------------------");
		List<WebElement> cells=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		
		for (WebElement cell: cells) {
			String cellText=cell.getText();
			System.out.println(cellText);
		}
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
