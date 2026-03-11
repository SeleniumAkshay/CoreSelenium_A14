package Popups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertNew {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//button[contains(text(),'alert')]")).click();
		driver.switchTo().alert().accept();

//		driver.get("https://www.makemytrip.com/");
//		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

		driver.get("https://www.ilovepdf.com/pdf_to_word");

		File file = new File("./data/ADVANCE SELENIUM.pdf");
		String path = file.getAbsolutePath();

		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);

		Thread.sleep(3000);
		driver.quit();

	}

}
