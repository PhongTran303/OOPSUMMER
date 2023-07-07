package bai3;
import java.util.ArrayList;
import java.util.List;
public class QuanLyGiaoDich {
    public static void main(String[] args) {
        List<GiaoDich> danhSachGiaoDich = new ArrayList<>();

        // Tạo sẵn 3 giao dịch vàng
        danhSachGiaoDich.add(new GiaoDichVang("VD001", "01/07/2023", 50, 10, "24K"));
        danhSachGiaoDich.add(new GiaoDichVang("VD002", "02/07/2023", 45, 5, "18K"));
        danhSachGiaoDich.add(new GiaoDichVang("VD003", "03/07/2023", 55, 8, "9999"));

        // Tạo sẵn 3 giao dịch tiền tệ
        danhSachGiaoDich.add(new GiaoDichTienTe("TT001", "01/07/2023", 1.5, 1000, 23000, "USD"));
        danhSachGiaoDich.add(new GiaoDichTienTe("TT002", "02/07/2023", 2.0, 500, 26000, "EUR"));
        danhSachGiaoDich.add(new GiaoDichTienTe("TT003", "03/07/2023", 1.8, 800, 1, "VND"));

        // Tính tổng số lượng cho từng loại
        int tongSoLuongVang = 0;
        int tongSoLuongTienTe = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichVang) {
                tongSoLuongVang += giaoDich.soLuong;
            } else if (giaoDich instanceof GiaoDichTienTe) {
                tongSoLuongTienTe += giaoDich.soLuong;
            }
        }

        System.out.println("Tổng số lượng giao dịch vàng: " + tongSoLuongVang);
        System.out.println("Tổng số lượng giao dịch tiền tệ: " + tongSoLuongTienTe);

        // Tính trung bình thành tiền của giao dịch tiền tệ
        double tongThanhTienTienTe = 0;
        int soLuongGiaoDichTienTe = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichTienTe) {
                tongThanhTienTienTe += giaoDich.tinhThanhTien();
                soLuongGiaoDichTienTe++;
            }
        }
        double trungBinhThanhTienTienTe = tongThanhTienTienTe / soLuongGiaoDichTienTe;

        System.out.println("Trung bình thành tiền của giao dịch tiền tệ: " + trungBinhThanhTienTienTe);

        // Xuất ra các giao dịch có đơn giá > 1 tỷ
        System.out.println("Các giao dịch có đơn giá > 1 tỷ:");
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich.donGia > 1000000000) {
                System.out.println("Mã giao dịch: " + giaoDich.maGiaoDich);
                System.out.println("Ngày giao dịch: " + giaoDich.ngayGiaoDich);
                System.out.println("Đơn giá: " + giaoDich.donGia);
                System.out.println("Số lượng: " + giaoDich.soLuong);
                if (giaoDich instanceof GiaoDichVang) {
                    System.out.println("Loại vàng: " + ((GiaoDichVang) giaoDich).loaiVang);
                } else if (giaoDich instanceof GiaoDichTienTe) {
                    System.out.println("Loại tiền tệ: " + ((GiaoDichTienTe) giaoDich).loaiTienTe);
                }
                System.out.println("Thành tiền: " + giaoDich.tinhThanhTien());
                System.out.println("----------");
            }
        }
    }
    }