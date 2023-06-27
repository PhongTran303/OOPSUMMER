package bai11;

import java.util.ArrayList;

public class HocVien {
     String hoTen;
     int namSinh;
     double diemToan;
     double diemLy;
     double diemHoa;
     double diemVan;
     double diemSu; 
    public HocVien() {
    	
    }
    
    public HocVien(String hoTen, int namSinh, double diemToan, double diemLy, double diemHoa, double diemVan, double diemSu) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.diemVan = diemVan;
        this.diemSu = diemSu;
    }
    
    public boolean laHocVienLamLuanVan() {
        double diemTrungBinh = (diemToan + diemLy + diemHoa + diemVan + diemSu) / 5;
        return diemTrungBinh >= 7 && diemToan >= 5 && diemLy >= 5 && diemHoa >= 5 && diemVan >= 5 && diemSu >= 5;
    }
    
    public boolean laHocVienThiTotNghiep() {
        double diemTrungBinh = (diemToan + diemLy + diemHoa + diemVan + diemSu) / 5;
        return diemTrungBinh < 7 && diemToan >= 5 && diemLy >= 5 && diemHoa >= 5 && diemVan >= 5 && diemSu >= 5;
    }
    
    public boolean phaiThiLai() {
        return diemToan < 5 || diemLy < 5 || diemHoa < 5 || diemVan < 5 || diemSu < 5;
    }
}

    
    