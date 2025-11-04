package week2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {
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
driver.findElement(By.partialLinkText("Leads")).click();
driver.findElement(By.partialLinkText("Find Leads")).click();
driver.findElement(By.partialLinkText("Phone")).click();
WebElement Phone = driver.findElement(By.name("phoneNumber"));
Phone.sendKeys("9080181012");
driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/table/tbody/tr/td/table/tbody/tr/td[2]/em/button")).click();
driver.findElement(By.className("subMenuButtonDangerous")).click();
	}
}