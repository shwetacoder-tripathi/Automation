package AutomateAjexCallChila;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https:\\www.amazon.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("nav-link-accountList"));

	}

}
