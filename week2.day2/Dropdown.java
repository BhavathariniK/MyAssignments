package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement testElement = driver.findElement(By.id("username"));
		testElement.sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XXX");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("YYY");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ZZZ");
		WebElement options = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select value = new Select(options);
		value.selectByValue("LEAD_CONFERENCE");
		
		
		

	}

}
