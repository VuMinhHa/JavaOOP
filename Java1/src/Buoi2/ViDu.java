package Buoi2;

import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tinhTuoi(sc);
        tongHieuSo(sc);
        hinhChuNhat(sc);
        hinhTron(sc);
        diemTrungBinh(sc);
    }

    //Tinh tuoi
    public static void tinhTuoi(Scanner scanner) {
        System.out.println("Nhap vao nam sinh: ");
        int namSinh;
        namSinh = scanner.nextInt();
        System.out.println("Nam sinh cua ban la: " + namSinh);
        System.out.println("Tuoi cua ban la: " + (2024 - namSinh));
        System.out.println("--------------------------------------------");
    }

    //Tong hieu 2 so
    public static void tongHieuSo(Scanner scanner) {
        System.out.println("A = ");
        double a = scanner.nextDouble();
        System.out.println("B = ");
        double b = scanner.nextDouble();
        System.out.println("Tong = " + (a + b));
        System.out.println("Hieu = " + (a - b));
    }

    //Chu vi dien tich hinh chu nhat
    public static void hinhChuNhat(Scanner scanner) {
        System.out.println("Chieu dai = ");
        double chieuDai = scanner.nextDouble();
        System.out.println("Chieu rong = ");
        double chieuRong = scanner.nextDouble();
        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;
        System.out.println("Chu vi = " + chuVi + ".\n " + "Dien tich = " + dienTich);
    }

    //Chu vi dien tich hinh tron
    public static void hinhTron(Scanner scanner) {
        System.out.println("Ban kinh duong tron = ");
        double r = scanner.nextDouble();
        //Chu vi
        double chuVi = r * 2 * Math.PI;
        //Dien tich
        double dienTich = (r * r) * Math.PI;
        System.out.println("Chu vi = " + chuVi + ".\n " + "Dien tich = " + dienTich);
    }

    //Tinh diem trung binh
    public static void diemTrungBinh(Scanner scanner) {
        System.out.println("Diem toan = ");
        float diemToan = scanner.nextFloat();
        System.out.println("Diem ly = ");
        float diemLy = scanner.nextFloat();
        System.out.println("Diem hoa = ");
        float diemHoa = scanner.nextFloat();

        float diemTrungBinh = (diemToan * 3 + diemLy * 2 + diemHoa) / 6;
        System.out.println("Diem trung binh = " + String.format("%.2f", diemTrungBinh));
    }
}
