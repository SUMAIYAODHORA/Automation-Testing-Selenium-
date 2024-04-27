package packagebatch12;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AutomationClass {
       public static void main(String[] args) throws InterruptedException {
        // WebDriver Initialization
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        // Webpage declaration
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        // Performing login
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        Thread.sleep(4000); // Avoid using Thread.sleep in actual test automation
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        driver.navigate().back();       
         //Title match using If-else
        String expectedTitle = "Swag Labs";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title match");
        } else {
            System.out.println("Title Doesn't Match");
        }
        // URL match check
        String expectedURL = "https://www.saucedemo.com/v1/";
        String actualURL = driver.getCurrentUrl();
        if (actualURL.equals(expectedURL)) {
            System.out.println("URL match");
        } else {
            System.out.println("URL Doesn't Match");
        }
        driver.quit();
    }
}

