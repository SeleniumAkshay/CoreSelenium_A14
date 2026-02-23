package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

//		driver.findElement(By.linkText("Create new account")).click();
//		driver.findElement(By.partialLinkText("Create")).click();

		List<WebElement> ele = driver.findElements(By.partialLinkText("Create"));
		System.out.println(ele.size());
		ele.get(2).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
