package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Cookie {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
//		Cookie newCookie = new Cookie("Qspiders_Velachery", "Selenium_A14");
//		driver.manage().addCookie(newCookie);

//		Cookie cookie1=new Cookie("datr", "5h2DaQJEqgJgOKcCPlwZyJmc");
//		driver.manage().deleteCookie(cookie1);

//		driver.manage().deleteAllCookies();
//		driver.manage().deleteCookieNamed("datr");
//
//		System.out.println(driver.manage().getCookieNamed("datr"));

		Set<Cookie> allCookies = driver.manage().getCookies();
		for (Cookie cookie : allCookies) {
			System.out.println(cookie);
		}

		Thread.sleep(2000);
		driver.quit();

	}

}
