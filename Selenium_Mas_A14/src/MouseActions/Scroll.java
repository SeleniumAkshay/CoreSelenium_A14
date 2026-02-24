package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		Actions act = new Actions(driver);

		Thread.sleep(3000);
//		act.scrollByAmount(0, 500).perform();
		WebElement ele = driver.findElement(By.xpath("//h3[text()='Customer service']"));
//		act.scrollToElement(ele).perform();

		ScrollOrigin origin = ScrollOrigin.fromElement(ele);
		act.scrollFromOrigin(origin, 0, 100).perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
