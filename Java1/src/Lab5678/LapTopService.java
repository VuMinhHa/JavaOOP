package Lab5678;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class LapTopService {
    Scanner sc = new Scanner(System.in);
    ArrayList<Laptop> list = new ArrayList<>();
    Laptop laptop = new Laptop();

    public void menu() {
        fakeData();
        int chon;
        do {
            System.out.println("|--------------------MENU---------------------|");
            System.out.println("|1. Nhap thong tin laptop                     |");
            System.out.println("|2. Xuat thong tin laptop                     |");
            System.out.println("|3. Xuat danh sach giam dan theo nam san xuat |");
            System.out.println("|4. Xoa thong tin laptop                      |");
            System.out.println("|5. Thoat                                     |");
            System.out.println("|---------------------------------------------|");
            System.out.println("Chon chuc nang: [1-5]");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    nhapThongTin();
                    break;
                case 2:
                    xuatThongTinLapTop();
                    break;
                case 3:
                    xuatDanhSachGiamDan();
                    break;
                case 4:
                    xoaThongTin();
                    break;
                case 5:
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chon chuc nang khong hop le");
            }
        } while (true);
    }

    private void xoaThongTin() {
        System.out.println("Nhap ma laptop can xoa: ");
        String ten = sc.nextLine();
        for (Laptop laptop1 : list) {
            if (laptop1.getTen().equalsIgnoreCase(ten)) {
                list.remove(laptop1);
                System.out.println("Da xoa " + ten + " thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay " + ten + " can xoa");
    }

    private void xuatDanhSachGiamDan() {
        Comparator<Laptop> comparator = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                return o2.getNamSanXuat() - o1.getNamSanXuat();
            }
        };
        list.sort(comparator);
        for (Laptop laptop1 : list) {
            laptop1.xuatThongTin();
        }
    }

    private void xuatThongTinLapTop() {
        System.out.println("  DANH SACH LAPTOP  ");
        for (Laptop laptop1 : list) {
            laptop1.xuatThongTin();
        }
    }

    private void nhapThongTin() {
        laptop.nhapThongTin();
        list.add(laptop);
    }

    private void fakeData() {
        list.add(new Laptop("Laptop 1", 10000, 2022));
        list.add(new Laptop("Laptop 2", 20000, 2021));
        list.add(new Laptop("Laptop 3", 30000, 2020));
        list.add(new Laptop("Laptop 4", 40000, 2024));
    }
}
