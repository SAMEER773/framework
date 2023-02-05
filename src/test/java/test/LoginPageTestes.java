package test;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Drive.DriverManager;
import Drive.ReadConfi;

final class LoginPageTestes extends BaseTest {
	
	private LoginPageTestes(){
	
	}
	
	@Test
	public void Test1() throws InterruptedException, IOException {
		
	
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(ReadConfi.getValue("username"));
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(ReadConfi.getValue("password"));
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		DriverManager.getDriver().getTitle();
		
		if (DriverManager.getDriver().getTitle().equals("Guru99 Bank Manager HomePage")){
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		Thread.sleep(2000);
	
		DriverManager.getDriver().findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		
	}
	
}



