package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com");

		driver.findElement(By.name("q")).sendKeys("iphone" + Keys.ENTER);
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//div[@class='G12X4V'])[2]"));

		act.dragAndDropBy(ele, -150, 0).perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
