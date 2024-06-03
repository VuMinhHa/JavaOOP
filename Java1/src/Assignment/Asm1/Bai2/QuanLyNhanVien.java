package Assignment.Asm1.Bai2;

import java.util.Scanner;

/**
 * @author vha74
 */
public class QuanLyNhanVien {
    private NhanVien[] danhSachNhanVien;
    private Scanner scanner;

    public QuanLyNhanVien() {
        danhSachNhanVien = new NhanVien[3];
        scanner = new Scanner(System.in);
    }


    public void menu() {
        int luaChon;
        do {
            System.out.println("|============================Menu===========================|");
            System.out.println("| 1. Nhập thông tin nhân viên.                              |");
            System.out.println("| 2. Xuất thông tin nhân viên.                              |");
            System.out.println("| 3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.    |");
            System.out.println("| 4. Xóa nhân viên theo mã nhập từ bàn phím.                |");
            System.out.println("| 5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím. |");
            System.out.println("| 6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.  |");
            System.out.println("| 7. Sắp xếp nhân viên theo họ và tên.                      |");
            System.out.println("| 8. Sắp xếp nhân viên theo thu nhập.                       |");
            System.out.println("| 9. Xuất 5 nhân viên có thu nhập cao nhất.                 |");
            System.out.println("| 0. Thoát                                                  |");
            System.out.println("|-----------------------------------------------------------|");
            System.out.println("Chọn chức năng [1-0]:");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    nhapDanhSachNhanVien();
                    break;
                case 2:
                    xuatDanhSachNhanVien();
                    break;
                case 0:
                    System.out.println("Đã thoát.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (true);
    }

    public void nhapDanhSachNhanVien() {
        for (int i = 0; i < danhSachNhanVien.length; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            danhSachNhanVien[i] = new NhanVien();
            danhSachNhanVien[i].nhapThongTin();
        }

    }

    public void xuatDanhSachNhanVien() {
        System.out.println("\nThông tin nhân viên ");
        for (int i = 0; i < danhSachNhanVien.length; i++) {
            System.out.println("Nhân viên thứ " + (i + 1) + ": " + danhSachNhanVien[i]);
        }
    }
}
