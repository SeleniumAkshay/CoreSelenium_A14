package JSE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.oracle.com/database/technologies/oracle-database-software-downloads.html");

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement ele = driver.findElement(By.id("db_ee"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);

		driver.findElement(By.xpath("(//a[text()='ZIP'])[1]")).click();
		WebElement ele1 = driver.findElement(By.xpath("//a[text()='Download LINUX.X64_2326100_db_home.zip']"));
		js.executeScript("arguments[0].click();", ele1);

		Thread.sleep(3000);
		driver.quit();

	}

}
