package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	@Test(priority = 1)
	public void delete() throws InterruptedException {
		System.out.println("Delete");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com");

		Thread.sleep(3000);
		driver.quit();
	}

	@Test(priority = 0)
	public void create() throws InterruptedException {
		System.out.println("Create");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://www.facebook.com");

		Thread.sleep(3000);
		driver.quit();
	}

	@Test(priority = 1,invocationCount = 5)
	public void login() throws InterruptedException {
		System.out.println("Login");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com");

		Thread.sleep(500);
		driver.quit();
	}

}
