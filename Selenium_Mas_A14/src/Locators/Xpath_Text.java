package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Text {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Travel ']")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
