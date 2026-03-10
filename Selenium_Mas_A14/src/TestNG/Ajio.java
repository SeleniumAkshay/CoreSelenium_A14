package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio {

	@Test
	public void ajio() throws InterruptedException {
		System.out.println("Ajio");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ajio.com");

		System.out.println(driver.getPageSource());

		Thread.sleep(3000);
		driver.quit();
	}

}
