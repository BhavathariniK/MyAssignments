package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Bhavatharini");
		driver.findElement(By.id("lastNameField")).sendKeys("Kannan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Bhava");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Tharini");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("Automation Testing");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("unknown@gmail.com");
		WebElement element = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(element);
		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Important");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
