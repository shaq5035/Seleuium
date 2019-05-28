package methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	public static WebDriver driver;
	
	public static void setUpDriver(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver");
		driver=new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "src/driver/geckodriver");
			driver=new FirefoxDriver();
		} else {
			System.out.println("browser given is wrong");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.get(url);


	}

	  public static void selectValueFromDD(WebElement element, String text) {
		  Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			boolean isSelected=false;
			for (WebElement option : options) {
				String optionText = option.getText();
				if (optionText.equals(text)) {
					select.selectByVisibleText(text);
					System.out.println("Option with text "+text+" is selected");
					isSelected=true;
					break;
				}
			}
			if(!isSelected) {
				System.out.println("Option with text +"+text+"is not available");
			}
	        }

	    public static void selectIndexValueFromDD(WebElement element, int index) {
	        Select select = new Select(element);
	        List<WebElement> options = select.getOptions();
	        for(WebElement option:options) {
	        	System.out.println(option.getText());
	        	if (options.size() > index) {
		            select.selectByIndex(index);
		        }else {
		            System.out.println("Invalid index has been passed");
		        }
	        }
	        
	    }
	    
	    public static void sendText(WebElement element, String value) {
	        element.clear();
	        element.sendKeys(value);
	    }
}
