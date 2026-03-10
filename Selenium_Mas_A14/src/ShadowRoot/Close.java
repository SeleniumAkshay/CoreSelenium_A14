package ShadowRoot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Close {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");

		driver.findElement(By.xpath("//h1[text()='Login']")).click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB + "abc@gmail.com").perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
