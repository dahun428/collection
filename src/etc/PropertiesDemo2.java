package etc;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesDemo2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("환경설정 파일 프로그램");

		System.out.print("서버 URL 을 입력하세요 : ");
		String url = sc.next();
		System.out.print("서버 PORT 을 입력하세요 : ");
		String port = sc.next();
		System.out.print("서버 UserName 을 입력하세요 : ");
		String userName = sc.next();
		System.out.print("서버 Password 을 입력하세요 : ");
		String pw = sc.next();
		
		Properties prop = new Properties();
		prop.setProperty("mail.server.url", url);
		prop.setProperty("mail.server.port", port);
		prop.setProperty("mail.server.userName", userName);
		prop.setProperty("mail.server.password", pw);
		
		prop.store(new FileWriter("src/mail.properties"), "Mail Server Configuration");
		
		System.out.println("설정이 완료되었습니다.");
		
		sc.close();
		
		prop.load(new FileReader("src/mail.properties"));
		
		String getUrl = prop.getProperty("mail.server.url");
		String getPort = prop.getProperty("mail.server.port");
		String getUserName = prop.getProperty("mail.server.userName");
		String getPw =prop.getProperty("mail.server.password");
		
		System.out.println("url  : " + getUrl);
		System.out.println("port : " +getPort);
		System.out.println("user : "+getUserName);
		System.out.println("pw   : "+getPw);
	}
	
	
}
