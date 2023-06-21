package bai7;

public class Main_HinhTron {
	public static void main(String[] args) {
		ToaDo toado = new ToaDo("O", 5, 5);
		HinhTron hinhtron = new HinhTron(toado, 10.5);
		
		System.out.println(hinhtron);
		
		System.out.println("Chu Vi: "+hinhtron.tinhChuVi());
		System.out.println("Diện tích: "+hinhtron.tinhDienTich());
	}
}


