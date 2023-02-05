package Drive;

import java.io.IOException;
import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

public final class Drive {

	private Drive() {

	}


	public static void Dri( String browser) throws IOException {


		if (Objects.isNull(DriverManager.getDriver())) {
			
			if(browser.equalsIgnoreCase("chrome")) {
			DriverManager.setDriver(new ChromeDriver());
			}
			DriverManager.getDriver().get(ReadConfi.getValue("url"));
			//DriverManager.getDriver().manage().window().maximize();

		}
	}

	public static void Quit() {
		if (Objects.nonNull(DriverManager.getDriver())) {

			DriverManager.getDriver().quit();
			DriverManager.unload();

		}

	}
}
