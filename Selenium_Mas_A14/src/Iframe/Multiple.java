package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");

		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("qsp@gmail.com");
		driver.switchTo().parentFrame().switchTo().frame(1);
		driver.findElement(By.id("username")).sendKeys("Qsp");

		Thread.sleep(3000);
		driver.quit();

	}

}
