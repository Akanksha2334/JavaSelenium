package TestNGTutorial;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	@Parameters({"URL","API/username"})
	@Test
public void demo(String urlname,String Apiuser) {
	System.out.println("Hello");
	System.out.println(urlname);
	System.out.println(Apiuser);
	Assert.assertTrue(false);
	
}
	@AfterTest
	public void lastExecution() {
		System.out.println("i will execute last");
	}
	@AfterSuite
	public void afsuite() {
		System.out.println("im the last one ");
	}
	@BeforeClass
	public void befClass() {
		System.out.println("execute before class");
	}
	@Test(groups= {"smoke"})
	public void secondTest() {
		System.out.println("bye");
	}
	
	
}
