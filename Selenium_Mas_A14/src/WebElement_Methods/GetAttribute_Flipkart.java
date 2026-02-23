package WebElement_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_Flipkart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);
		List<WebElement> tag = driver.findElements(By.tagName("a"));

		for (int i = 0; i < tag.size(); i++) {
//			String att = tag.get(i).getAttribute("href");
//			String att = tag.get(i).getDomProperty("href");
			String att = tag.get(i).getDomAttribute("href");
			System.out.println(att);
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
