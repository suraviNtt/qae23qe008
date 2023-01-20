package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Selenium");
		searchbox.sendKeys(Keys.ENTER);
		
		
//		Thread.sleep(1000);
//		WebElement googleSearch = driver.findElement(By.name("btnK"));
//		googleSearch.click();
//		driver.close();
	}

}
