package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFileNew {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("./data/testDataNew.properties");
		Properties pro = new Properties();
		pro.load(fis);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(pro.getProperty("url"));

		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.name("q")).sendKeys(pro.getProperty("productName") + Keys.ENTER);

		Thread.sleep(3000);
		driver.quit();

	}

}
