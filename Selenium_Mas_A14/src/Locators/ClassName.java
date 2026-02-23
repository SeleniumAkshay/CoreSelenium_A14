package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

//		driver.findElement(By.className("ico-login")).click();

//		driver.findElement(By.className("cart-label")).click();

		List<WebElement> ele = driver.findElements(By.className("cart-label"));
		ele.get(1).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
