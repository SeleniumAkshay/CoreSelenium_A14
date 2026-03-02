package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/downloads/");

		Actions act=new Actions(driver);
		act.scrollByAmount(0, 300).perform();
		driver.findElement(By.xpath("//p[text()='Java']/../p[2]/a")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
