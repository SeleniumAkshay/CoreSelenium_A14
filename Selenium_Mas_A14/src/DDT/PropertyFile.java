package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("./data/testDataA14.properties");
		Properties pro = new Properties();
		pro.load(fis);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(pro.getProperty("url"));

		driver.findElement(By.name("email")).sendKeys(pro.getProperty("username"));
		driver.findElement(By.name("pass")).sendKeys(pro.getProperty("password"));

		Thread.sleep(3000);
		driver.quit();

	}

}
