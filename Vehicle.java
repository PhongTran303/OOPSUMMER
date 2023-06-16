package bai4;

public class Vehicle {
	
	private String name;
	private String type;
	private double price;
	private int xylanh;
	
	public Vehicle() {
	}
	
	public Vehicle(String name, String type, double price, int xylanh)
	{
		this.name = name;
		this.type = type;
		setPrice(price);
		setXylanh(xylanh);
	}
	

	public double tax()
	{
		double fee = 0;
		if(xylanh < 100)
			fee = (price/100);
		if(xylanh<200)
			fee = (price*3/100);
		else 
			fee = (price*5/100);
		return fee;
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
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0)
		{
			System.out.println("Nhap sai");
		}else {
				this.price = price;
		}
	}
	
	public int getXylanh() {
		return xylanh;
	}
	public void setXylanh(int xylanh) {
		if(xylanh <0)
		{
			System.out.println("Nhap sai");
		}
		else {
		this.xylanh = xylanh;
	}	 
}
	
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", type=" + type + ", price=" + price+ ", xylanh=" + xylanh + "]";
	}
	
	
	void xuatBang() {
		System.out.printf("%-10s %-10s %5d %10.2f %8.5f \n ",name,type,xylanh,price,tax());
	}
	
}

