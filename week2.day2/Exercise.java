package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Exercise {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement testElement = driver.findElement(By.xpath("//input[@type='text']"));
		testElement.sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@type,'sub')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Lead')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'create')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("XXX");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("YYY");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("ZZZ");
		driver.findElement(By.xpath("//input[contains(@name,'Button')]")).click();
	}

}
