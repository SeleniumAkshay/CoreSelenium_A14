package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAriaRole {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String aria = driver.findElement(By.name("login")).getAriaRole();
		System.out.println(aria);
		
		String acc = driver.findElement(By.id("email")).getAccessibleName();
		System.out.println(acc);

		Thread.sleep(3000);
		driver.quit();

	}

}
