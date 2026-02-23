package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_InDep {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone" + Keys.ENTER);
		String text = driver
				.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']/../../div[2]/div[1]/div/div"))
				.getText();
		System.out.println(text);

		Thread.sleep(3000);
		driver.quit();

	}

}
