package initialdays;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AWR_SignUpPage {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	
	driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	Thread.sleep(2000);
System.out.println(driver.findElement(By.tagName("p")).getText());	
	
	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	
	driver.quit();
}
}
