package TestNGTutorial;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	@Override
	 public  void onTestFailure(ITestResult result) {
		    // not implemented
		System.out.println("i faild in executing listener"+result.getName());
		  }
	 @Override
	 public void onTestSuccess(ITestResult result) {
		    System.out.println("i successfully added listeners passcode");
		  }


}
