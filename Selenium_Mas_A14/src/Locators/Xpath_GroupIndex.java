package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_GroupIndex {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone" + Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='RG5Slk'])[1]")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
