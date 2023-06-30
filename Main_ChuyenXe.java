package bai1;

public class Main_ChuyenXe {
    public static void main(String[] args) {
        ChuyenXe[] danhSachChuyenXe = new ChuyenXe[2];
     
        danhSachChuyenXe[0] = new ChuyenXeNoiThanh("NT1", "Tai Xe 1", "Xe 1", 4000000, "Tuyen 1", 200);
      
        danhSachChuyenXe[1] = new ChuyenXeNgoaiThanh("NGT1", "Tai Xe 2", "Xe 2", 5000000, "Dia diem A", 5);
        
     
        
        int tongDoanhThu = 0;
        int tongDoanhThuNoiThanh = 0;
        int tongDoanhThuNgoaiThanh = 0;

        for (ChuyenXe chuyenXe : danhSachChuyenXe) {
            chuyenXe.xuatThongTin();
            System.out.println();

            tongDoanhThu += chuyenXe.doanhThu;

            if (chuyenXe instanceof ChuyenXeNoiThanh) {
                tongDoanhThuNoiThanh += chuyenXe.doanhThu;
            } else if (chuyenXe instanceof ChuyenXeNgoaiThanh) {
                tongDoanhThuNgoaiThanh += chuyenXe.doanhThu;
            }
        }

        System.out.println("Tong doanh thu tat ca cac chuyen xe: " + tongDoanhThu);
        System.out.println("Tong doanh thu chuyen xe noi thanh: " + tongDoanhThuNoiThanh);
        System.out.println("Tong doanh thu chuyen xe ngoai thanh: " + tongDoanhThuNgoaiThanh);
    }
}

