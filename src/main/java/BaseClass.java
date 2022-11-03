

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
		// chrome browser
		public static WebDriver chromeBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
            return driver;
		}
		
		// url 
		public static void url(String url) {
			driver.get(url);
		}
		// maximize
		public static void maximize() {
			driver.manage().window().maximize();
		}
		//time
		public static void time(long secs) {
			driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
		}
		//sendkeys
		public static void sendKeys(WebElement e, String value) {
			e.sendKeys(value);
		}
		//click
		public static void click(WebElement e) {
			e.click();
		}
		//selectby index
		public static void selectByIndex( WebElement ref,int e) {
			selectByIndex(ref,e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
