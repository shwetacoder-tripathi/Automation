package sele;
import java.time.Duration;

import org.junit.jupiter.api.Test;
import  org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {
	
	@Test
	public void myAutomationTest() {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
		driver.navigate().to("https://fast.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[@for='demo-human']")).click();
		driver.findElement(By.xpath("//a[@class='button special startButton big']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Results']")));
		WebElement element=driver.findElement(By.id("measurementSpace"));
	
	  
	  System.out.println(element.getText());
	 
	driver.findElement(By.xpath("//a[@class='scrolly']//span[@class='ng-scope'][normalize-space()='About']")).click();
     driver.findElement(By.cssSelector("")).click();
      driver.findElement(By.cssSelector("a[href='https://codeforscience.org']")).click();
      
      
      // Fast.com locate//////////
		/*driver.findElement(By.xpath("//div[@aria-label='FAST.com logo']")).click();
		driver.findElement(By.cssSelector("#show-more-details-link")).click();
		//System.out.println(element.getText());
		//driver.close();
		//driver.quit();*/
	}

}
