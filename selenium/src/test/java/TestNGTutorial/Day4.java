package TestNGTutorial;

import org.testng.annotations.Test;

public class Day4 {
	@Test
	public void webHomeLoan() {
		System.out.println(" web home loan");
	}
	@Test(groups= {"smoke"})
	public void mobileHomeLoan() {
		System.out.println("mobile home loan");
	}
	

}
