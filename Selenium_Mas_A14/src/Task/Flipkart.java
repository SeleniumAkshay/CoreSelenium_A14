package Task;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone" + Keys.ENTER);

		Thread.sleep(2000);
		List<WebElement> productNames = driver.findElements(By.xpath("//div[@class='RG5Slk']"));
		List<WebElement> productPrices = driver
				.findElements(By.xpath("//div[@class='RG5Slk']/../../div[2]/div[1]/div/div[1]"));

		for (int i = 0; i < productNames.size(); i++) {
			String pn = productNames.get(i).getText();
			String pp = productPrices.get(i).getText();
			System.out.println(pn + "-------------" + pp);
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
