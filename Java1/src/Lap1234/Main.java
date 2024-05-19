package Lap1234;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        while (true){
            int choice = scanner.nextInt();
            System.out.println("Menu");
            System.out.println("1. Bai1");
            System.out.println("2. Bai2");
            switch (choice){
                case 1:
                    tongChanLeTu1N();
                    break;
                case 2:
                    diemTbHang();
                    break;
                default:
                    System.out.println("Nhap lai");
            }
        }
    }

    public static void tongChanLeTu1N() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("N = ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("N la so nguyen duong");
        }

        int sumLe= 0;
        int sumChan = 0;
        for (int i = 1; i <= n; i += 2) sumLe += i;
        for (int i = 2;i<=n;i+=2) sumChan+=i;
        System.out.println("Tong ca so le tu 1 den N = " + sumLe);
        System.out.println("Tong ca so chan tu 1 den N = " + sumChan);
    }

    public static void diemTbHang() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diem toan = ");
        double toan = scanner.nextDouble();
        System.out.println("Diem van = ");
        double van = scanner.nextDouble();
        System.out.println("Diem anh = ");
        double anh = scanner.nextDouble();
        double diemTB = (toan + van + anh) / 3;
        String hang;
        if (diemTB >= 8) {
            hang = "Hang A";
        } else if (diemTB >= 6) {
            hang = "Hang B";
        } else if (diemTB >= 4) {
            hang = "Hang C";
        } else {
            hang = "Hang F";}
        System.out.println("Diem trung binh 3 mon = " + String.format("%.2f",diemTB) + ". " + hang);
    }


}
