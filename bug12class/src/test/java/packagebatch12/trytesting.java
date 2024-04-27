package packagebatch12;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class trytesting {
	  public static void main(String[] args) throws InterruptedException {
	        // WebDriver Initialization
		  WebDriverManager.firefoxdriver().setup();
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://trytestingthis.netlify.app/");
		  driver.manage().window().maximize();
		  //First & Last Name inserting
		  WebElement fn = driver.findElement(By.name("fname"));
		  fn.sendKeys("Sumaiya");
		  WebElement ln = driver.findElement(By.name("lname"));
		  ln.sendKeys("Aodhora");
		  //Radio Button
		  WebElement gender = driver.findElement(By.id("female"));
		  gender.click();
		  assert gender.isSelected();
		  System.out.println(gender.isSelected());
		  //Drop-Down
		  WebElement dropdown=driver.findElement(By.id("option"));
		  Select drop = new Select(dropdown);
		  //Index
		  drop.selectByIndex(2);
		  Thread.sleep(2000);
		  drop.selectByValue("option 3");
		  //Scroll
		  WebElement scrollop = driver.findElement(By.id("owc"));
		  Select scroll = new Select(scrollop);
		  scroll.selectByValue("option 2");
		  //Checklist
		  //WebElement checkop = driver.findElement(By.name("option1"));
		  //checkop.click();
		  //WebElement checkop2 = driver.findElement(By.name("option2"));
		  //checkop2.click();
		  //WebElement checkop3 = driver.findElement(By.name("option3"));
		  //checkop3.click();
		// Select option 1
		// Select option 1
		  WebElement option1 = driver.findElement(By.name("option1"));
		  option1.click();
         Thread.sleep(3000);
		  // Deselect option 2
		  WebElement option2 = driver.findElement(By.name("option2"));
		  if (option2.isSelected()) {
		      option2.click();
		  }
		  Thread.sleep(3000);
		  // Select all options
		  // Assuming all options are checkboxes and are identifiable by the name attribute
		  WebElement option3 = driver.findElement(By.name("option3"));

		  // Click option 3 to select it if it is not already selected
		  if (!option3.isSelected()) {
		      option3.click();
		  }

		  // Since option 2 was previously deselected, select it again
		  if (!option2.isSelected()) {
		      option2.click();
		  }

		  // Finally, ensure option 1 is selected (if not already)
		  if (!option1.isSelected()) {
		      option1.click();
		  }

		  //Long Message
		  WebElement msg = driver.findElement(By.name("message"));
		  msg.clear();
		  msg.sendKeys("I am a Software Quality Assurance Enthusiast");
		  //Submit Button Clicking
		  //WebElement sub = driver.findElement(By.className("btn-success"));
		  //sub.click();
	  }
	}

