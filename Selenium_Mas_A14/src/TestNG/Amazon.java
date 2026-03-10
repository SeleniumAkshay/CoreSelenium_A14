package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {

	@Test
	public void amazon() throws InterruptedException {
		System.out.println("Amazon");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://www.amazon.com");

		System.out.println(driver.getCurrentUrl());
//		driver.findElement(By.id("QAFQW")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
