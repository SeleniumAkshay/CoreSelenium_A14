package Popups;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_DOB {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();

		int i = 0;

		while (true) {

			String text = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

			if (text.equals("September 2003")) {
				driver.findElement(By.xpath("//a[text()='1']")).click();
				break;
			} else {
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
			i++;
		}

		System.out.println(i);
		Thread.sleep(3000);
		driver.quit();
	}

}
