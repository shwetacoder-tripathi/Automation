package sele;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;

public class SchoolWebsite {
	
	static WebDriver driver;
	
	
	@BeforeEach
	public void setupBrowser() {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(options);
	 }
	 
	
	@Test
	public void myAutomationTestCase() {
		driver.navigate().to("https://facegenie-ams-school.web.app/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys("test101@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("#password"));
		password.sendKeys("Test@101");
		driver.findElement(By.xpath("//button[normalize-space()='Log In']")).click();
	
	}	

}

