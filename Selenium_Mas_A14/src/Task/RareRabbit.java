package Task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class RareRabbit {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://thehouseofrare.com/");

		WebElement men = driver.findElement(By.xpath("(//a[text()='MEN'])[1]"));

		Actions act = new Actions(driver);
		act.moveToElement(men).perform();

		WebElement cloth = driver.findElement(By.xpath("(//a[text()='CLOTHING'])[1]"));
		WebElement coming = driver.findElement(By.xpath("(//a[text()='COMING SOON'])[1]"));

		act.pause(3000).moveToElement(cloth).pause(2000).perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", coming);

		WebElement product = driver.findElement(By.xpath("(//div[@class='product-main-inner'])[1]"));
		act.moveToElement(product).click().perform();

		driver.findElement(By.xpath("(//span[@class='swatch-image'])[2]")).click();
		driver.findElement(By.xpath("(//h3[@class='option-value'])[1]")).click();

		WebElement atc = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		js.executeScript("arguments[0].click();", atc);

		driver.findElement(By.partialLinkText("CHECKOUT")).click();

		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/rareRabbit.png");
		FileHandler.copy(temp, dest);

		Thread.sleep(3000);
		driver.quit();

	}

}
