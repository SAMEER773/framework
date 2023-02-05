package Drive;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class ReadConfi {
	private ReadConfi() {
		
	}
	
	public static String getValue(String key) throws IOException {
		
		Properties pro=new Properties();
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
		pro.load(file);
		return pro.getProperty(key);
		
		
		
		
	}

}
