package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildTab_FB {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");

		String id = driver.getWindowHandle();
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'password')]"));
		Actions act = new Actions(driver);
		act.contextClick(ele).pause(2000).perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		for (String string : ids) {
			driver.switchTo().window(string);
			Thread.sleep(2000);
		}

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.switchTo().window(id);

		Thread.sleep(3000);
		driver.quit();
	}

}
