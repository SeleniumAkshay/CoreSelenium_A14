package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVG {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("redmi");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.xpath("(//*[name()='svg'])[1]")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
