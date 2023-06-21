package bai7;

public class HinhTron {
	private ToaDo tam;
	private double banKinh;
	private final double pi = 3.14;
	
	public HinhTron() {
	}

	

	public HinhTron(ToaDo tam, double banKinh) {
		this.tam = tam;
		this.banKinh = banKinh;
	}



	public ToaDo getTam() {
		return tam;
	}



	public void setTam(ToaDo tam) {
		this.tam = tam;
	}



	public double getBanKinh() {
		return banKinh;
	}



	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}



	public double getPi() {
		return pi;
	}



	public double tinhChuVi() {
		return banKinh * 2 * pi;
	}
	public double tinhDienTich() {
		return pi*(banKinh*banKinh);
	}
}