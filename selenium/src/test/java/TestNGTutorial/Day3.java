package TestNGTutorial;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day3 {
	@Test(enabled = false)
	public void webCarLoan() {
		System.out.println(" web Car loan");
	}
	@BeforeSuite
	public void bfsuite() {
		System.out.println("im no. 1");
	}
	@BeforeMethod
	public void beforeEvery() {
		System.out.println("execute before every test block in day3 class");
	}
	
	@Test(dataProvider = "getData")
	public void mobileLogInCarLoan(String username,String password) {
		System.out.println("login Car loan");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData() {
		//1st combination username password
		//2nd combination
		//3rd combination username password
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="firstusername";
		data[0][1]="password";
		
		//2nd
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		//3rd
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
		
	}
	@Test(dependsOnMethods = {"mobileSignOutCarLoan"})
	public void APISignInCarLoan() {
		System.out.println("APi Car loan");
	}
	@Test
	public void mobileSignOutCarLoan() {
		System.out.println("signout Car loan");
	}

}
