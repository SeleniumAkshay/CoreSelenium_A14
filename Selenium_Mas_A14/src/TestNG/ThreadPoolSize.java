package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPoolSize {
	
	@Test(invocationCount = 5,threadPoolSize = 10)
	public void whatsapp() throws InterruptedException {
		
		System.out.println("Whatsapp");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.whatsapp.com/");

		Thread.sleep(500);
		driver.quit();
		
	}

}
