package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Drive.DriverManager;


public class Home_Page_test extends BaseTest {
	@Test
	public void test2() throws InterruptedException {
		
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("mngr464037");
		Thread.sleep(2000);
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("pyqavAt");
		Thread.sleep(2000);
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		
	
		
		DriverManager.getDriver().findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
		Thread.sleep(10000);
		DriverManager.getDriver().switchTo().alert().dismiss();
		
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("Preetham");
		Thread.sleep(2000);
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		DriverManager.getDriver().findElement(By.xpath("//input[@id='dob']")).sendKeys("09/10/1996");
		Thread.sleep(2000);
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[7]/td[2]/textarea[1]")).sendKeys("Shivanagar");
		Thread.sleep(2000);
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("Bangalore");
		Thread.sleep(2000);
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("Karnataka");
		Thread.sleep(2000);
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("560010");
		Thread.sleep(2000);
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[11]/td[2]/input[1]")).sendKeys("777380777373");
		Thread.sleep(2000);
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[12]/td[2]/input[1]")).sendKeys("preeth@gmail.com");
		Thread.sleep(2000);
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]")).sendKeys("Preeth@123");
		Thread.sleep(2000);
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		
		DriverManager.getDriver().getPageSource().concat("Customer Registered Successfully!!!");
		
		
		DriverManager.getDriver().findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		
	}

}
