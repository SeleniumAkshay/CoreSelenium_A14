package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//button[contains(text(),'alert')]")).click();
//		driver.switchTo().alert().accept();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//button[contains(text(),'confirm')]")).click();
		driver.switchTo().alert().accept();

		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[contains(text(),'prompt')]")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("ABC");
		Thread.sleep(2000);
		alert1.accept();

		Thread.sleep(3000);
		driver.quit();

	}

}
