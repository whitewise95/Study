package step9_02.coffee;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CoffeeVO {

	
	private String name;
	private int price;
	private Date date;
	
	public CoffeeVO(String name,    int price,     Date date) {
		super();
		this.name = name;

		this.price = price;

		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat df = new DecimalFormat("#,##0원");
//		return "CoffeeVO [name=" + name + ", type=" + type + ", price=" + price + ", some=" + some + ", date=" + date
//				+ "]";
		return String.format("%s\t%s\t%s", name, df.format(price),sdf.format(date));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
