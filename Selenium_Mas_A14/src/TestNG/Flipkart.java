package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {

	@Test
	public void flipkart() throws InterruptedException {
		System.out.println("Flipkart");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com");

		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		driver.quit();
	}

}
