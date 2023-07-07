package bai4;
import java.util.ArrayList;

public class QuanLyGiaoDich {
    public static void main(String[] args) {
        ArrayList<GiaoDich> danhSachGiaoDich = new ArrayList<>();

        // Thêm các giao dịch vào danh sách (không nhập từ bàn phím)
        danhSachGiaoDich.add(new GiaoDichDat("GD001", "01/09/2013", 1000000, 200, "A"));
        danhSachGiaoDich.add(new GiaoDichDat("GD002", "02/09/2013", 1500000, 300, "B"));
        danhSachGiaoDich.add(new GiaoDichDat("GD003", "03/09/2013", 1200000, 250, "C"));

        danhSachGiaoDich.add(new GiaoDichNha("GD004", "01/09/2013", 2000000, 100, "cao cấp", "123 ABC Street"));
        danhSachGiaoDich.add(new GiaoDichNha("GD005", "02/09/2013", 1500000, 120, "thường", "456 XYZ Street"));
        danhSachGiaoDich.add(new GiaoDichNha("GD006", "03/09/2013", 1800000, 150, "thường", "789 DEF Street"));

        int countGiaoDichDat = 0;
        int countGiaoDichNha = 0;
        double tongThanhTienGiaoDichDat= 0;

        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                countGiaoDichDat++;
                tongThanhTienGiaoDichDat += giaoDich.thanhTien();
            } else if (giaoDich instanceof GiaoDichNha) {
                countGiaoDichNha++;
            }
        }

        // Tính trung bình thành tiền của giao dịch đất
        double trungBinhThanhTienGiaoDichDat = tongThanhTienGiaoDichDat / countGiaoDichDat;

        System.out.println("Tổng số lượng giao dịch đất: " + countGiaoDichDat);
        System.out.println("Tổng số lượng giao dịch nhà: " + countGiaoDichNha);
        System.out.println("Trung bình thành tiền của giao dịch đất: " + trungBinhThanhTienGiaoDichDat);

        System.out.println("Các giao dịch trong tháng 9 năm 2013:");
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich.ngayGiaoDich.startsWith("09/2013")) {
                System.out.println(giaoDich.maGiaoDich + " - " + giaoDich.ngayGiaoDich);
            }
        }
    }
    }



