package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		System.out.println(tags.size());
		tags.get(1).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
