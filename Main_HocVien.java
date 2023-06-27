package bai11;
import java.util.ArrayList;
public class Main_HocVien {
	public static void main(String[] args) {
        ArrayList<HocVien> lopHoc = new ArrayList<>();
        lopHoc.add(new HocVien("Tran Ho Hai Phong", 2003, 8.0, 7.5, 6.5, 8.5, 9.0));
        lopHoc.add(new HocVien("Tran Minh Anh", 2001, 6.5, 7.0, 5.5, 7.0, 6.5));
        lopHoc.add(new HocVien("Le Van Cuong", 1999, 8.5, 9.0, 8.0, 7.5, 8.0));
        lopHoc.add(new HocVien("Pham Thi Diem", 2002, 4.0, 7.5, 6.0, 5.5, 7.0));
        
        int soLuongHocVienLamLuanVan = 0;
        int soLuongHocVienThiTotNghiep = 0;
        String monThiLai = "";
        for (HocVien hocVien : lopHoc) {
            if (hocVien.laHocVienLamLuanVan()) {
                soLuongHocVienLamLuanVan++;
            } else if (hocVien.laHocVienThiTotNghiep()) {
                soLuongHocVienThiTotNghiep++;
            }
            if (hocVien.phaiThiLai()) {
                if (monThiLai.isEmpty()) {
                    monThiLai += "Mon: ";
                } else {
                    monThiLai += ", ";
                }
                if (hocVien.diemToan < 5) {
                    monThiLai += "Toan";
                }
                if (hocVien.diemLy < 5) {
                    monThiLai += "Ly";
                }
                if (hocVien.diemHoa < 5) {
                    monThiLai += "Hoa";
                }
                if (hocVien.diemVan < 5) {
                    monThiLai += "Van";
                }
                if (hocVien.diemSu < 5) {
                    monThiLai += "Su";
                }
            }
            
            System.out.println("So luong hoc vien lam luan van tot nghiep: " + soLuongHocVienLamLuanVan);
            System.out.println("So luong hoc vien thi tot nghiep: " + soLuongHocVienThiTotNghiep);
            if (!monThiLai.isEmpty()) {
                System.out.println("Danh sach mon thi lai: " + monThiLai);
            } else {
                System.out.println("Khong co hoc vien nao phai thi lai.");
            }
        }
	}
}
