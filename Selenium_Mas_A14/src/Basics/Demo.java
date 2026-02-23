package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

		Thread.sleep(10000);
		driver.findElement(By.id("name")).sendKeys("ABC");

		Thread.sleep(3000);
		driver.quit();

	}

}
