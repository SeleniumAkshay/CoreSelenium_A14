package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
//		String title = driver.getTitle();
//		System.out.println(title);
		
		System.out.println(driver.getTitle());

	}

}
