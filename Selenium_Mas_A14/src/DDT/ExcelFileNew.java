package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFileNew {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("./data/testDataA14.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys(wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue());
		driver.findElement(By.name("pass")).sendKeys(wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue());

		Thread.sleep(3000);
		driver.quit();

	}

}
