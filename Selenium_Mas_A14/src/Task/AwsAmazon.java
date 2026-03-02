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
import org.openqa.selenium.io.FileHandler;

public class AwsAmazon {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://aws.amazon.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.findElement(By.xpath("//span[text()='Pricing']")).click();
		driver.findElement(By.xpath("//span[text()='AWS Pricing']")).click();
		driver.findElement(By.xpath("//span[text()='Free Tier']")).click();

		WebElement ele = driver.findElement(By.xpath("(//h2[@data-rg-n='HeadingText'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true);",ele);

		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/aws.png");
		FileHandler.copy(temp, dest);

		Thread.sleep(3000);
		driver.quit();

	}

}
