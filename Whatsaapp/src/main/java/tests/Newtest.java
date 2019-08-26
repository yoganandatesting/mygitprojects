package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Newtest {
	public WebDriver driver;
	
	  @Test
	  public void openMyBlog() {
		driver.get("https://www.amazon.in/");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  
		 // System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		  //driver = new FirefoxDriver();
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
		  
	  }


}
