package bai2;

public class Student {
	private int id;
	private String name;
	private double diemLT;
	private double diemTH;
	public Student() {
		super();
	}
	public Student(int id, String name, double diemLT, double diemTH) {
		super();
		if(id <= 0 ) {
			this.id = 0;
		}else {
			this.id = id;
		}	
		this.name = name;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id <= 0 ) {
			this.id = 0;
			System.out.println("Nhap sai");
		}else {
			this.id = id;
		}	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == "") {
			System.out.println("Nhap sai ");
		}else {
			this.name = name;
		}
		
	}
	public double getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(double diemLT) {
		if(diemLT < 0 || diemLT > 10 ) { 
			this.diemLT = 0;
			System.out.println("Nhap sai");
		}else {
			this.diemLT = diemLT;
		}	
		
	}
	public double getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(double diemTH) {
		if(diemTH < 0 || diemTH > 10 ) {
			this.diemTH = 0;
			System.out.println("Nhap sai");
		}else {
			this.diemTH = diemTH;
		}	
	}
	
	public double CalAve() {
		return (diemLT + diemTH)/2;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", diemLT=" + diemLT + ", diemTH=" + diemTH + "]";
	}

	
}