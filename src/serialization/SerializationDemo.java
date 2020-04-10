package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo{


	public static void main(String[] args) throws IOException {
		User user = new User();
		user.setNo(100);
		user.setUserId("dahun");
		user.setPassword("1111");
		user.setTel("010-1234-1322");
		user.setEmail("dahun4428@naver,cin");
		
		UserGrade grade = new UserGrade();
		grade.setGrade("VIP");
		grade.setPoint(24000);
		user.setGrade(grade);
		
		FileOutputStream fos = new FileOutputStream("c:/files/user.sav");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//user참조변수가 참조하는 객체를 스트림으로 전송가능한 상태로 만들어서
		//연결된 FileOutPutStream으로 보낸다.
		//FileOutPutStream 은 user.sav 파일로 출력한다.
		oos.writeObject(user);
		oos.close();
	}
}
