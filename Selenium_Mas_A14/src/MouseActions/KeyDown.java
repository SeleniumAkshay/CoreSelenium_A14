package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		Actions act = new Actions(driver);

		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("small-searchterms"));

//		act.click(ele).sendKeys("Books").perform();
//		act.sendKeys(ele, "Book").keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

		act.sendKeys(ele, "Book" + Keys.ENTER).perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
