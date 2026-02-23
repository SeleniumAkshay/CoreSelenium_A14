package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("qsp@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Qsp@1234");
		driver.findElement(By.name("login")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
