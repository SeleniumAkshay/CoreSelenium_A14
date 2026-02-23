package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Absolute {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/a/div/div[2]")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
