package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='card']/button")).click();
		String title = driver.getTitle();
		if (title.contains("Dashboard")) {
			System.out.println("Title is confirmed");
		}

		Boolean disableStatus = driver
				.findElement(By.className(
						"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled"))
				.isEnabled();

		if (disableStatus.equals(false)) {
			System.out.println("Button is disabled");
		} else {
			System.out.println("Button is enabled");

			System.out.println("Location of submit button is: "
					+ driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-bookmark']"))
							.getLocation());

		}

	}
}
