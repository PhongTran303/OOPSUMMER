package bai3;

public class Main_TamGiac {
	public static void main(String[] args) {
		TamGiac tamgiac = new TamGiac(2, 3, 4);
		System.out.println(tamgiac);
		System.out.println("Chu vi:" + tamgiac.chuViTamGiac());
		System.out.println("Dien tich: " + tamgiac.dienTichTamGiac());
		
		tamgiac.checkTamGiac();
		
		TamGiac tamgiac2 = new TamGiac(2, 2, 2);
		
		System.out.println(tamgiac2);
		System.out.println("Chu vi:" + tamgiac2.chuViTamGiac());
		System.out.println("Dien tich: " + tamgiac2.dienTichTamGiac());
		
		tamgiac2.checkTamGiac();
	}
}