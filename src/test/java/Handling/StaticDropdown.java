package Handling;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class StaticDropdown {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        // Handling dropdown select tag -> static 
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	      Select dropdown = new Select(staticDropdown);
	      dropdown.selectByIndex(3);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByVisibleText("AED");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByValue("INR");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	
	      
	}

}
