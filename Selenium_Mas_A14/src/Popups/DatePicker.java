package Popups;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);
//		driver.findElement(By.id("datepicker")).sendKeys("05/09/2026");
		driver.findElement(By.id("datepicker")).click();
		
		driver.findElement(By.xpath("//a[text()='30']")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
