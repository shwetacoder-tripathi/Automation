package sele;



import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWebsite {
	
		@Test
		public void myAutomationTestCaseForAmazon() {
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https:\\www.amazon.com");
			driver.manage().window().maximize();
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("realme");
		searchBox.submit();
		WebElement submitButton =driver.findElement(By.id("nav-search-submit-button"));
		  submitButton.submit();
		 driver.findElement(By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_4'] a[class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
		 driver.findElement(By.cssSelector("input[aria-labelledby='comparison_add_to_cart_button-announce']")).click();
		 driver.findElement(By.xpath("//a[@href='/cart?ref_=sw_gtc']")).click();
		 driver.close();
		 
		}
}
