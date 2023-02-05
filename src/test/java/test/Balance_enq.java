package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Drive.DriverManager;

public class Balance_enq extends BaseTest {
	
	private Balance_enq() {
		
	}
	@Test
	public void Test3() throws InterruptedException {
		
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("mngr464037");
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("pyqavAt");
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		
		DriverManager.getDriver().findElement(By.linkText("Balance Enquiry")).click();
		Thread.sleep(5000);
		DriverManager.getDriver().switchTo().alert().dismiss();
		
		Thread.sleep(5000);
		DriverManager.getDriver().findElement(By.cssSelector("table.layout:nth-child(8) table:nth-child(1) tbody:nth-child(1) tr:nth-child(6) td:nth-child(2) > input:nth-child(1)")).sendKeys("123456789");
		Thread.sleep(5000);
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[11]/td[2]/input[1]")).click();
		
		Thread.sleep(5000);
		DriverManager.getDriver().findElement(By.xpath("//a[contains(text(),'Log out')]")).click();

		
		
	}

}
