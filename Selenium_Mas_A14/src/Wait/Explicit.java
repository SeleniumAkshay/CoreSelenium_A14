package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Qsp");

		driver.get("https://www.selenium.dev/");
		wait.until(ExpectedConditions.titleContains("Selenium"));
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();

		wait.until(ExpectedConditions.urlContains("downloads"));
		driver.findElement(By.xpath("//span[text()='Projects']")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
