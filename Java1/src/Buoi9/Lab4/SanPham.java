package Buoi9.Lab4;

import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public SanPham() {
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public double thueNhapKhau(){
        return donGia*0.1;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        tenSP = sc.nextLine();
        System.out.println("Nhap don gia san pham: ");
        donGia = sc.nextDouble();
        System.out.println("Nhap giam gia san pham: ");
        giamGia = sc.nextDouble();

    }

    public void xuatThongTin(){
        System.out.println("Ten san pham: " + tenSP);
        System.out.println("Don gia san pham: " + donGia);
        System.out.println("Giam gia san pham: " + giamGia);
        System.out.println("Thue nhap khau: " + thueNhapKhau());
    }
}
