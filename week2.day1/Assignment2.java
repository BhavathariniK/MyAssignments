package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  driver.manage().window().maximize(); 
		  WebElement testElement = driver.findElement(By.id("username"));
		  testElement.sendKeys("DemoSalesManager");
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		  driver.findElement(By.className("decorativeSubmit")).click();
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  driver.findElement(By.linkText("Leads")).click();
		  driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XXX");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("YYY");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ZZZ");
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("AAA");
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("BBB");
		  driver.findElement(By.id("createLeadForm_description")).sendKeys("CCC");
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("unknown@gmail.com");
		  driver.findElement(By.name("submitButton")).click();
		  driver.findElement(By.linkText("Edit")).click();
		  driver.findElement(By.name("description")).clear();
		  driver.findElement(By.name("importantNote")).sendKeys("Important");
		  driver.findElement(By.name("submitButton")).click();
		  String title = driver.getTitle();
		  System.out.println(title);
		  
	}

}
