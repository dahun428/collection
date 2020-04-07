package vo;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {

	private int no;
	private String name;
	private String maker;
	private int price;
	private Date createDate = new Date();
	SimpleDateFormat df = new SimpleDateFormat("yyyy년MM월dd일");
	DecimalFormat decimalform = new DecimalFormat("#,###");
	
	
	public Product(int no, String name, String maker, int price) {
		super();
		this.no = no;
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.createDate = new Date();
	}


	public Product() {}

	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getPrice() {	
		return decimalform.format(price);
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCreateDate() {
		return df.format(createDate);
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + no;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (no != other.no)
			return false;
		return true;
	}
	
	
	
}
