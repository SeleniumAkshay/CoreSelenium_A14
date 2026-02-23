package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingAllBrowsers_WebDriver {

	public static void main(String[] args) {

		// 13 Methods ---- 11 Webdriver 2 searchcontext
		WebDriver driver = new ChromeDriver();
		driver = new EdgeDriver();
		driver = new FirefoxDriver();

	}

}
