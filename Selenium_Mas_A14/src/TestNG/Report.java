package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report {

	@Test
	public void demo() {
		System.out.println("Hi");
		Reporter.log("Hello", false);
		Reporter.log("Bye", true);
	}

}
