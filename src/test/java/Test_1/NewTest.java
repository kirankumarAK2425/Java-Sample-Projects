package Test_1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	  public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
// driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
		
	  }
	
	
	
  @Test
  public void f() {
  }
  

  @AfterMethod
  public void afterMethod() {
  }

}
