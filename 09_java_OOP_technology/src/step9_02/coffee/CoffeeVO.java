package step9_02.coffee;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CoffeeVO {

	
	private String name;
	private String type;
	private int price;
	private int some;
	private Date date;
	
	public CoffeeVO(String name,   String type,     int price,    int some,    Date date) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.some = some;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSome() {
		return some;
	}

	public void setSome(int some) {
		this.some = some;
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
		return String.format("%s%s%s%s%s", name,type, df.format(price), some,sdf.format(date));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
