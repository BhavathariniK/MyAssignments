package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;


public class LeafGroundTextbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']")).sendKeys("Bhavatharini");
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("Bangalore");
		
		Boolean disableStatus = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-disabled']")).isEnabled();
		if (disableStatus.equals(false))
		{
			System.out.println("Textbox is disabled");
		}
		else
		{
			System.out.println("Textbox is enabled");
		}
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		driver.findElement(By.id("j_idt88:j_idt97")).getText();
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("unknown@gmail.com", Keys.TAB);
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("Myself");
		Thread.sleep(1000);
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		String errmsgStatus = driver.findElement(By.id ("j_idt106:thisform:j_idt110_error-detail")).getText();
		
		if (errmsgStatus.equals("Age is mandatory"))
		{
			System.out.println("Error message is present");
		}
		else
		{
			System.out.println("Error merssage is not present");
		}
		driver.findElement(By.id("j_idt106:auto-complete_input")).sendKeys("Bhavatharini");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='tooltip']//following::span//li[3]")).click();
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt122']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_editor']//p")).sendKeys("Custom toolbar is displaying");
		driver.close();
		
		
		
		
		
	

	}

}
