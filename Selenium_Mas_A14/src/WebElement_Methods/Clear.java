package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("ABC");
		Thread.sleep(2000);
		ele.clear();

		Thread.sleep(3000);
		driver.quit();

	}

}
