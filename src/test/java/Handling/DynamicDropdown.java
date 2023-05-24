package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://spicejet.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")).click();
       driver.findElement(By.xpath("//div[normalize-space()='Sardar Vallabhbhai Patel International Airport']")).click();
        driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")).click();
	    driver.findElement(By.xpath("//div[normalize-space()='Kishangarh Airport']")).click();
	}

}
