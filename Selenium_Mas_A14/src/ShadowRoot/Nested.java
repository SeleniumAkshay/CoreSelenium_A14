package ShadowRoot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nested {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/shadow/nested?sublist=2");

		SearchContext ele = driver.findElement(By.xpath("//div[@class='shadowOuter']")).getShadowRoot();
		ele.findElement(By.cssSelector("label[for='email']")).click();

		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB + "qspiders").perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
