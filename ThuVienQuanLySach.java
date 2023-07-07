package bai2;
import java.util.ArrayList;
import java.util.List;
public class ThuVienQuanLySach {
    public static void main(String[] args) {
        List<Sach> danhSachSach = new ArrayList<>();

        // Thêm sách giáo khoa vào danh sách
        danhSachSach.add(new SachGiaoKhoa("SGK1", "01/07/2023", 100000, 5, "NXB A", "mới"));
        danhSachSach.add(new SachGiaoKhoa("SGK2", "02/07/2023", 200000, 3, "NXB B", "cũ"));
        danhSachSach.add(new SachGiaoKhoa("SGK3", "03/07/2023", 150000, 2, "NXB C", "mới"));

        // Thêm sách tham khảo vào danh sách
        danhSachSach.add(new SachThamKhao("STK1", "04/07/2023", 300000, 4, "NXB D", 50000));
        danhSachSach.add(new SachThamKhao("STK2", "05/07/2023", 250000, 6, "NXB E", 60000));
        danhSachSach.add(new SachThamKhao("STK3", "06/07/2023", 180000, 8, "NXB F", 70000));
     
   

        // Tính tổng thành tiền cho từng loại sách
        double tongThanhTienSachGiaoKhoa = 0;
        double tongThanhTienSachThamKhao = 0;
        for (Sach sach : danhSachSach) {
            if (sach instanceof SachGiaoKhoa) {
                SachGiaoKhoa sachGiaoKhoa = (SachGiaoKhoa) sach;
                tongThanhTienSachGiaoKhoa += sachGiaoKhoa.tinhThanhTien();
            } else if (sach instanceof SachThamKhao) {
                SachThamKhao sachThamKhao = (SachThamKhao) sach;
                tongThanhTienSachThamKhao += sachThamKhao.tinhThanhTien();
            }
        }

        System.out.println("Tổng thành tiền sách giáo khoa: " + tongThanhTienSachGiaoKhoa);
        System.out.println("Tổng thành tiền sách tham khảo: " + tongThanhTienSachThamKhao);

        // Tính trung bình cộng đơn giá của các sách tham khảo
        int countSachThamKhao = 0;
        double sumDonGiaSachThamKhao = 0;
        for (Sach sach : danhSachSach) {
            if (sach instanceof SachThamKhao) {
                SachThamKhao sachThamKhao = (SachThamKhao) sach;
                sumDonGiaSachThamKhao += sachThamKhao.getDonGia();
                countSachThamKhao++;
            }
        }

        double trungBinhDonGiaSachThamKhao = sumDonGiaSachThamKhao / countSachThamKhao;
        System.out.println("Trung bình cộng đơn giá sách tham khảo: " + trungBinhDonGiaSachThamKhao);

        // Xuất ra các sách giáo khoa của nhà xuất bản K
        String nhaXuatBanK = "NXB B";
        System.out.println("Các sách giáo khoa của nhà xuất bản " + nhaXuatBanK + ":");
        for (Sach sach : danhSachSach) {
            if (sach instanceof SachGiaoKhoa && sach.getNhaXuatBan().equals(nhaXuatBanK)) {
                System.out.println(sach.toString());
            }
        }
    }
}
