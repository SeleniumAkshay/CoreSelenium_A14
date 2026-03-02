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

public class JioHotstar {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.jiohotstar.com");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.findElement(By.xpath("//i[contains(@class,'icon-movies-line')]")).click();
		WebElement movies = driver.findElement(By.xpath("//h2[text()='New Movies for You']"));

		js.executeScript("arguments[0].scrollIntoView(true);", movies);
		WebElement ele = driver.findElement(By.xpath(
				"//h2[text()='New Movies for You']/../../../../../../div[2]/div/div/div[1]/div/div/div/div/article/div[1]/span/img"));
		js.executeScript("arguments[0].click();", ele);

		Thread.sleep(1500);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/jioHotstar.png");
		FileHandler.copy(temp, dest);

		Thread.sleep(3000);
		driver.quit();

	}

}
