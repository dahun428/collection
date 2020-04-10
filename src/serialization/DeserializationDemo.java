package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String file ="c:/files/user.sav";
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		//스트림으로 읽어온 직렬화된 객체의 정보를 바탕으로User객체를 복원한다.
		User user = (User) ois.readObject();
		System.out.println("번호     : " + user.getNo());
		System.out.println("ID    : "+user.getUserId());
		System.out.println("PW    : "+user.getPassword());
		System.out.println("TEL   : "+user.getTel());
		System.out.println("Email : "+user.getEmail());
		System.out.println("GRADe : "+user.getGrade().getGrade());
		System.out.println("point : "+user.getGrade().getPoint());
		ois.close();
	}
}
