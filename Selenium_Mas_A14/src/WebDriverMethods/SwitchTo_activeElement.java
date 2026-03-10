package WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_activeElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);
		driver.switchTo().activeElement()
				.sendKeys("abc@gmail.com" + Keys.TAB + "Qsp@1234" + Keys.TAB + Keys.TAB + Keys.ENTER);

		Thread.sleep(3000);
		driver.quit();

	}

}
