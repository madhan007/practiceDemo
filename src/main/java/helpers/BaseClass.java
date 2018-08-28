package helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	
	protected  WebDriver driver=null;
	
	@BeforeClass
	
	public void startUp() {
		
		System.setProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	}
	
	@AfterClass
	public void closeBrowser(){
		
		driver.quit();
		
	}
}
