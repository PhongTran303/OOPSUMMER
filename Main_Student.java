package bai2;

public class Main_Student {
	public static void main(String[] args) {
		Student student = new Student(0, "Hải", 6, 8);
		Student student2 = new Student(5, "Phong", 8, 3);
	
		System.out.println(student);
		System.out.println("sv1: "+ student.CalAve());
		System.out.println(student2);
		System.out.println("sv2: "+ student2.CalAve());
		
	}
}
