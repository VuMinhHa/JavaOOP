package Lab5678;

import java.util.Scanner;

public class Laptop {
    private String ten;
    private double gia;
    private int namSanXuat;

    public Laptop() {
    }

    public Laptop(String ten, double gia, int namSanXuat) {
        this.ten = ten;
        this.gia = gia;
        this.namSanXuat = namSanXuat;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten laptop: ");
        ten = sc.nextLine();
        System.out.println("Nhap gia: ");
        gia = sc.nextDouble();
        System.out.println("Nhập năm sản xuất: ");
        namSanXuat = sc.nextInt();
    }

    public void xuatThongTin() {
        System.out.println("Ten laptop: " + ten);
        System.out.println("Gia: " + gia);
        System.out.println("Nam san xuat: " + namSanXuat);
        System.out.println();
    }
}
