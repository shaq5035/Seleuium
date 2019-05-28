package review01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.CommonMethods;

public class QAToolsPt2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/automation-practice-form/");

		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Demo Form for practicing Selenium Automation")) {
			System.out.println("you are in the right location");
			Thread.sleep(1000);
		} else {
			System.out.println("you are in the WRONG location");
		}

		driver.findElement(By.name("firstname")).sendKeys("FirstName");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		driver.quit();
	}

}
