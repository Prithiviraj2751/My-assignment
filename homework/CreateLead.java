package week2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/logout");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
WebElement password = driver.findElement(By.name("PASSWORD"));
password.sendKeys("crmsfa"); 
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM")).click(); 
driver.findElement(By.partialLinkText("Create Lead")).click(); 
WebElement companyName=driver.findElement(By.id("createLeadForm_companyName"));
	companyName.sendKeys("Test Leaf");
	WebElement firstName=driver.findElement(By.id("createLeadForm_firstName"));
	firstName.sendKeys("Prithivirajan");
	WebElement lastName=driver.findElement(By.id("createLeadForm_lastName"));
	lastName.sendKeys("S");
	WebElement title=driver.findElement(By.name("generalProfTitle"));
	title.sendKeys("Create Lead");
	WebElement phNo=driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
	phNo.sendKeys("9080181012");
	driver.findElement(By.name("submitButton")).click();
	
	}
}
