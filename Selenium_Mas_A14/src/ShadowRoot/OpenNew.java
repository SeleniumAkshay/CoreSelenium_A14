package ShadowRoot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNew {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");

		SearchContext un = driver.findElement(By.xpath("(//div[@class='my-3'])[1]")).getShadowRoot();
		un.findElement(By.cssSelector("input[placeholder='Enter your username']")).sendKeys("Abc");

		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");

		driver.findElement(By.xpath("//h1[text()='Login']")).click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB + "Qsp").perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
