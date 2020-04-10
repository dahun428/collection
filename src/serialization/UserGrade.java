package serialization;

import java.io.Serializable;

public class UserGrade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6750995255647247335L;
	private String grade;
	private int point;
	public UserGrade() {
		super();
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
