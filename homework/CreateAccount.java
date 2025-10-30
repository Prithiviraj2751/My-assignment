package week2.homework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class CreateAccount {
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
driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.linkText("Create Account")).click();
WebElement accName= driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[1]/td[2]/input"));
accName.sendKeys("Prithivi");
WebElement descrption= driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[9]/td[2]/textarea"));
descrption.sendKeys("selenium Automation Tester");
driver.findElement(By.className("smallSubmit")).click();
driver.close();
	}

}
