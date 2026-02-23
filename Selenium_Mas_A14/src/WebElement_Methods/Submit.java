package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonSubmit?sublist=3");

		Thread.sleep(3000);
		driver.findElement(By.id("sat_a")).click();
		driver.findElement(By.id("btn_abh")).submit();

		Thread.sleep(3000);
		driver.quit();

	}

}
