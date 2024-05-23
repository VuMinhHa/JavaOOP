package Assignment.Asm1.Bai2;

import java.util.Scanner;

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
            System.out.println("=======Menu=======");
            System.out.println("1. Nhập thông tin nhân viên");
            System.out.println("2. Xuất thông tin nhân viên ");
            System.out.println("0. Thoát");
            System.out.println("Chọn chức năng:");
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
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (luaChon != 0);
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
            System.out.println("Nhân viên thứ " + (i+1) +": "+danhSachNhanVien[i]);
        }
    }
}
