package TestNGTutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test(groups= {"smoke"})
public void loan() {
	System.out.println("Loan");
}
	@BeforeTest
	public void prerequisite() {
		System.out.println("i will exceute first");
	}
	@AfterMethod
	public void afterEvery() {
		System.out.println("i will execute after every method");
	}
	@AfterClass
	public void afClass() {
		System.out.println("execute after class");
	}
	
}
