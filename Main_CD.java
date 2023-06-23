package bai8;
import java.util.Scanner;

public class Main_CD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CDList cdList = new CDList(10);
        int choice;
        do {
            System.out.println("------------------------------");
            System.out.println("1. Thêm CD");
            System.out.println("2. Hiển thị số lượng CD và tổng giá thành");
            System.out.println("3. Hiển thị thông tin chi tiết của tất cả CD");
            System.out.println("4. Sắp xếp CD theo giá thành giảm dần");
            System.out.println("5. Sắp xếp CD theo tựa CD tăng dần");
            System.out.println("0. Thoát chương trình");
            System.out.print("Mời bạn chọn chức năng: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    CD cd = new CD();
                    System.out.print("Mã CD: ");
                    cd.setMaCD(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Tựa CD: ");
                    cd.setTuaCD(scanner.nextLine());
                    System.out.print("Số bài hát: ");
                    cd.setSoBaiHat(scanner.nextInt());
                    System.out.print("Giá thành: ");
                    cd.setGiaThanh(scanner.nextDouble());
                    if (cdList.addCD(cd)) {
                        System.out.println("Thêm CD thành công!");
                    } else {
                        System.out.println("Không thể thêm CD!");
                    }
                    break;
                case 2:
                    System.out.println("Số lượng CD: " + cdList.getCount());
                    System.out.println("Tổng giá thành: " + cdList.getTotalPrice());
                    break;
                case 3:
                    System.out.println(cdList.getAllCDInfo());
                    break;
                case 4:
                    cdList.sortByPriceDescending();
                    System.out.println("Danh sách CD đã sắp xếp theo giá thành giảm dần:");
                    System.out.println(cdList.getAllCDInfo());
                    break;
                case 5:
                    cdList.sortByTitleAscending();
                    System.out.println("Danh sách CD đã sắp xếp theo tựa CD tăng dần:");
                    System.out.println(cdList.getAllCDInfo());
                    break;
                case 0:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        } while (choice != 0);
    }
}
