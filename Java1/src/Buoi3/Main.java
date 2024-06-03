package Buoi3;

import java.util.Scanner;

/**
 * @author vha74
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tien luong = ");
        double luong = sc.nextDouble();
        System.out.println(tinhThue(luong));

        //Diem trung binh va hang
        System.out.println("Diem toan = ");
        double toan = sc.nextDouble();
        System.out.println("Diem van = ");
        double van = sc.nextDouble();
        System.out.println("Diem anh = ");
        double anh = sc.nextDouble();
        System.out.println(tinhDiemHang(toan, van, anh));
    }

    public static String tinhThue(double luong) {
        if (luong < 0) {
            return "Luong k hop le";
        }

        double thue;
        if (luong < 10) {
            thue = luong * 0.05;
        } else if (luong < 20) {
            thue = luong * 0.1;
        } else {
            thue = luong * 0.2;
        }
        double luongsauthue = luong - thue;
        return "Thue =" + thue + ". Luong sau thue = " + luongsauthue;
    }


    public static String tinhDiemHang(double diemToan, double diemVan, double diemAnh) {
        if (diemToan < 0 || diemVan < 0 || diemAnh < 0 || diemToan > 10 || diemVan > 10 || diemAnh > 10) {
            return "Diem k dc duoi 0";
        }

        double diemTB = (diemToan + diemVan + diemAnh) / 3;

        String hang;
        if (diemTB >= 8) {
            hang = "Hang A";
        } else if (diemTB >= 6) {
            hang = "Hang B";
        } else if (diemTB >= 4) {
            hang = "Hang C";
        } else {
            hang = "Hang F";
        }
        return "Hạng: " + hang + ", Điểm trung bình: " + String.format("%.2f", diemTB);
    }
}
