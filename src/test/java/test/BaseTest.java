package test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Drive.Drive;

public class BaseTest {



	@BeforeClass
	public void Setup(String bro) throws IOException{
		Drive.Dri(bro);

	}

	
	
	
	@AfterClass

	public void Quit() {
		Drive.Quit();

		


	}

}



