package bai9;

import java.util.Scanner;

public class Main_CongNhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong cong nhan: ");
        int n = scanner.nextInt();

        DanhSachCongNhan danhSach = new DanhSachCongNhan(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cong nhan thu " + (i + 1) + ":");
            System.out.print("Ma CN: ");
            int maCN = scanner.nextInt();
            System.out.print("Ho: ");
            String mHo = scanner.next();
            System.out.print("Ten: ");
            String mTen = scanner.next();
            System.out.print("So san pham: ");
            int mSoSP = scanner.nextInt();

            CongNhan cn = new CongNhan(maCN, mHo, mTen, mSoSP);
            danhSach.themCongNhan(cn);
        }

        System.out.println("Danh sach cong nhan vua nhap:");
        danhSach.xuatThongTin();

        System.out.println("So luong cong nhan trong danh sach: " + danhSach.tinhSoLuong());

        System.out.println("Cac cong nhan lam tren 200 san pham:");
        danhSach.xuatThongTinSP200();

        danhSach.sapXepGiamDanTheoSP();
        System.out.println("Danh sach cong nhan da sap xep theo so san pham giam dan:");
        danhSach.xuatThongTin();
    }
}

