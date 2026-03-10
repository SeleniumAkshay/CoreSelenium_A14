package ShadowRoot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");

		SearchContext un = driver.findElement(By.xpath("(//div[@class='my-3'])[1]")).getShadowRoot();
		un.findElement(By.cssSelector("input[placeholder='Enter your username']")).sendKeys("ABC");

		SearchContext pwd = driver.findElement(By.xpath("(//div[@class='my-3'])[2]")).getShadowRoot();
		pwd.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("abc@1234");
		
		Thread.sleep(3000);
		driver.quit();

	}

}
