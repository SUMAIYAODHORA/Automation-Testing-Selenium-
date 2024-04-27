package packagebatch12;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNG {
	WebDriver driver;
	@BeforeTest
	public void Init() {
		// WebDriver Initialization
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  driver.get("https://www.saucedemo.com/v1/");
	      driver.manage().window().maximize();
	}
	@Test
	
	public void login() {
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
	}
	
	@Test
	public void page1() {
		//driver.quit();
		driver.close();
	}
	
	 }


