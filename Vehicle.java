package bai4;

public class Vehicle {
	
	private int id;
	private String name;
	private String type;
	private double price;
	private int xylanh;
	
	public Vehicle() {
	}
	
	public Vehicle(int id, String name, String type, double price, int xylanh)
	{
		this.id = id;
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
		this.price = price;
	}
	
	public int getXylanh() {
		return xylanh;
	}
	public void setXylanh(int xylanh) {
		this.xylanh = xylanh;
	}
	 
	
}

