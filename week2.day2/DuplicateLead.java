package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//td[contains(@class,'firstName')]//a"));
		String Name1 = firstName.getText();
		firstName.click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		WebElement duplicateName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String Name2 = duplicateName.getText();
		if (Name2.equals(Name1)) 
		{
			System.out.println("It is Duplicate");
			} 
		else 
		{
			System.out.println("It is not Duplicate");
		}

		

	}

}
