package packagebatch12;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Absolute_path {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	//Bike Light
	driver.findElement(By.xpath("//button[@name=\"add-to-cart-sauce-labs-bike-light\"]")).click();
	driver.findElement(By.xpath("//button[@name=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]"))
	.click();
	Thread.sleep(3000);
	//Bucket Clicking
	driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
	Thread.sleep(3000);
	//checkout
	driver.findElement(By.id("checkout")).click();
	driver.findElement(By.id("first-name")).sendKeys("standard");
	driver.findElement(By.id("last-name")).sendKeys("user");
	driver.findElement(By.id("postal-code")).sendKeys("3560");
	driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
	driver.findElement(By.xpath("html/body/div/div/div/div/div/div[2]/div[9]/button[2]")).click();
	}
	}

