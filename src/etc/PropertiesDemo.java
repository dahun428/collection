package etc;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		prop.load(new FileReader("src/config.properties"));
		
		String url= prop.getProperty("host.url");
		String pw= prop.getProperty("host.password");
		String port= prop.getProperty("host.port");
		String username= prop.getProperty("host.username");
		
		System.out.println("url : "+url);
		System.out.println("pw  : "+pw);
		System.out.println("port: "+port);
		System.out.println("ID  : "+username);
		
		
		
	}
}
