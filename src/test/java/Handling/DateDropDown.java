package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://spicejet.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[4]/div[4]/div[1]/div[1] ")).click();


	}

}
