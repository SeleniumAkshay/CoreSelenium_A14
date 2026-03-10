package Popups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ChildTab {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com");

		String id = driver.getWindowHandle();
		System.out.println(id);

		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone" + Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='RG5Slk'])[1]")).click();

		System.out.println();
		Set<String> ids = driver.getWindowHandles();
		ids.remove(id);

		Thread.sleep(2000);
		for (String string : ids) {
			driver.switchTo().window(string);
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Buy now']")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/flipkart03.png");
		FileHandler.copy(temp, dest);

		Thread.sleep(3000);
		driver.quit();
		//DIV[contains(@class,'CTTtEa')]/descendant-or-self::*[local-name()='svg' and normalize-space(@fill)='none'][30]
	}

}
