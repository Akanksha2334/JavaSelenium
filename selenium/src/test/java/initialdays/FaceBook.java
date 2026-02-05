package initialdays;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	//open the url
	driver.get("https://www.facebook.com/");
	
	//enter email
	driver.findElement(By.id("email")).sendKeys("admin123@gmail.com");
	
	//enter password
	driver.findElement(By.id("pass")).sendKeys("123456");
	
	//click on login
	driver.findElement(By.cssSelector("button[name='login']")).click();
	
	
	
	
	driver.quit();
	
}
}
