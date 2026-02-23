package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");

		WebElement ele = driver.findElement(By.id("select-multiple-native"));
		Select sel = new Select(ele);

		sel.selectByIndex(3);
		Thread.sleep(1000);
		sel.selectByIndex(5);
		sel.selectByVisibleText("Mens Casual Premium ...");
		Thread.sleep(1000);
//		sel.deselectByVisibleText("Mens Casual Slim Fit...");
		System.out.println(sel.getFirstSelectedOption().getText());
		System.out.println();

		List<WebElement> allSelected = sel.getAllSelectedOptions();
		for (WebElement ele1 : allSelected) {
			System.out.println(ele1.getText());
		}
		System.out.println();

		List<WebElement> options = sel.getOptions();
		for (WebElement opt : options) {
			System.out.println(opt.getText());
		}

		sel.deselectAll();
		System.out.println();

		System.out.println(sel.isMultiple());

		Thread.sleep(3000);
		driver.quit();

	}

}
