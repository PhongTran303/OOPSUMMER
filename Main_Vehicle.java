package bai4;

public class Main_Vehicle {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("Phong","Jeep",8000,1000);
		Vehicle vehicle2 = new Vehicle("An","Toyota",1000,2000);

		
		vehicle1.tax();
		vehicle2.tax();
	
		
		
		
		System.out.printf("%5s %12s %5s %5s %5s \n","Chủ xe","Loại xe", "Dung tích","Trị giá","Thuế phải nộp");
        vehicle1.xuatBang();
        vehicle2.xuatBang();
	}
}