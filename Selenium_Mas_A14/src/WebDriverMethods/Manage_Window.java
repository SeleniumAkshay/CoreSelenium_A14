package WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Window {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.whatsapp.com");

//		driver.manage().window().maximize();
//		driver.manage().window().minimize();
//		driver.manage().window().fullscreen();

//		Dimension oldSize = driver.manage().window().getSize();
//		System.out.println(oldSize);

//		Dimension newSize = new Dimension(500, 500);
//		driver.manage().window().setSize(newSize);
		
//		Point oldPosition = driver.manage().window().getPosition();
//		System.out.println(oldPosition);
		
		Point newPosition=new Point(500,500);
		driver.manage().window().setPosition(newPosition);

		Thread.sleep(2000);
		driver.quit();

	}

}
