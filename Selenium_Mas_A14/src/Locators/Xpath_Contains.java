package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Contains {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

//		driver.findElement(By.xpath("//span[contains(text(),'cart')]")).click();

		driver.findElement(By.xpath("//input[contains(@value,'store')]")).sendKeys("Book" + Keys.ENTER);

		Thread.sleep(3000);
		driver.quit();

	}

}
