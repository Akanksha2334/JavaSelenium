package initialdays;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AWP_Automation {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	//open the url
	driver.get("https://automationwithpiyush.vercel.app/");
	
	//click on practice
	driver.findElement(By.linkText("Practice")).click();
	
	//click on locator
	driver.findElement(By.xpath("//h4[text()='Locators']")).click();
	
	//enter username
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("akanksha");
	
	//enter password
	driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("123456");
	
	//click on checkbox
	driver.findElement(By.cssSelector("div input[type='checkbox']")).click();
	//click on login
	driver.findElement(By.xpath("//button[contains(text(),'Secure Login ')]")).click();
	
	driver.navigate().back();
	//click on webelements
	driver.findElement(By.xpath("//h4[text()='Web Elements']")).click();
	
	//first name
	driver.findElement(By.cssSelector("#firstName")).sendKeys("akanksha");
	
	//lastname
	driver.findElement(By.id("lastName")).sendKeys("singh");
	
	//email
	driver.findElement(By.cssSelector("#userEmail")).sendKeys("admin123@gmai.com");
	
	//select gender
	driver.findElement(By.xpath("//span[text()='Female']/..//input")).click();
	
	//select language java
	driver.findElement(By.xpath("//span[text()='Java']/..//input")).click();
	//select language python
	driver.findElement(By.xpath("//span[text()='Python']/..//input")).click();
	
	//click on submit
	driver.findElement(By.xpath("//button[contains(text(),'Data')]")).click();
	
	driver.navigate().back();
	
	//dropdown 
	driver.findElement(By.xpath("//h4[text()='Dropdowns']")).click();
	
	//single select
WebElement ss=	driver.findElement(By.id("single-select"));
	
	Select sel=new Select(ss);
	sel.selectByIndex(1);
	
	//multi select 
WebElement ms=	driver.findElement(By.id("multi-select"));
Select sel2=new Select(ms);
sel2.selectByIndex(0);
sel2.selectByValue("app");
sel2.selectByVisibleText("Jenkins CI/CD");

List<WebElement>op=sel2.getOptions();
for(WebElement x:op) {
	System.out.println(x.getText()+" ");
}
sel2.deselectAll();
driver.navigate().back();

//actions class
driver.findElement(By.xpath("//h4[text()='Actions Class']")).click();

Actions act=new Actions(driver);
WebElement hover=driver.findElement(By.xpath("//button[contains(text(),'Hover')]"));
act.moveToElement(hover).build().perform();

//leftclick
WebElement lclick=driver.findElement(By.id("click-box"));
	act.click(lclick).build().perform();
	
	//rightclick
WebElement rclick=	driver.findElement(By.id("right-click-area"));
act.contextClick(rclick).build().perform();

//double click
WebElement dclick= driver.findElement(By.id("double-click-area"));
act.doubleClick(dclick).build().perform();

//click and hold
WebElement ch=driver.findElement(By.id("click-hold"));
act.clickAndHold(ch).pause(Duration.ofSeconds(5)).release().perform();

//dragand hold
WebElement src=driver.findElement(By.id("prod-laptop"));
WebElement dest=driver.findElement(By.id("cart-placeholder"));
	act.dragAndDrop(src, dest).build().perform();
	
WebElement src1=	driver.findElement(By.id("prod-phone"));
WebElement dest1=driver.findElement(By.id("cart-placeholder"));
act.dragAndDrop(src1, dest1).build().perform();

WebElement src2=driver.findElement(By.id("prod-watch"));
WebElement dest2=driver.findElement(By.id("cart-placeholder"));
act.dragAndDrop(src2, dest2).build().perform();

WebElement src3=driver.findElement(By.id("prod-headphones"));
WebElement dest3=driver.findElement(By.id("cart-placeholder"));
act.dragAndDrop(src3, dest3).build().perform();

driver.quit();

}
}
