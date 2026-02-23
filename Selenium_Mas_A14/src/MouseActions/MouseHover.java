package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.partialLinkText("GIFT"));

		act.moveToElement(ele).perform();
//		act.moveToElement(ele).build().perform();

//		act.moveToLocation(ele.getLocation().getX(), ele.getLocation().getY()).perform();
//		act.moveByOffset(ele.getLocation().getX(), ele.getLocation().getY()).perform();

//		act.moveToElement(ele).pause(3000).click().perform();
//		act.click(ele).perform();

		WebElement ele1 = driver.findElement(By.partialLinkText("COMP"));
		act.moveToElement(ele1).perform();
		WebElement ele2 = driver.findElement(By.partialLinkText("Desktops"));
		act.moveToElement(ele1).click(ele2).perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
