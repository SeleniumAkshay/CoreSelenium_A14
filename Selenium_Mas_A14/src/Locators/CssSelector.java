package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

//		driver.findElement(By.cssSelector("input#email")).sendKeys("qsp@gmail.com");
//		driver.findElement(By.cssSelector("input._9npi")).sendKeys("Qsp@1234");
//		driver.findElement(By.cssSelector("button[name='login']")).click();

		driver.findElement(By.cssSelector("a._42ft[data-testid='open-registration-form-button']")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
