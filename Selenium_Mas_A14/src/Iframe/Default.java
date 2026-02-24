package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Default {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");

		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("username")).sendKeys("ABC");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//section[text()='Web Elements']")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
