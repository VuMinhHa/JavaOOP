package Buoi11;

import java.util.Scanner;

public class Lesson11 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap usename: ");
//        String name = sc.nextLine();
//        System.out.println("Nhap password: ");
//        String password = sc.nextLine();
//
//        if (name.equalsIgnoreCase("hello") && password.length()>6){
//            System.out.println("Dang nhap thanh cong");
//        } else {
//            System.out.println("Dang nhap that bai");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] mangHoTen = new String[n];
        String pattern = "";

        for (int i = 0; i < mangHoTen.length; i++) {
            System.out.println("Phan tu thu " + i + ": ");
            mangHoTen[i] = scanner.nextLine();
        }

        for (String s : mangHoTen) {
            System.out.println("Phan tu: " + s.toUpperCase());
            if (s.toLowerCase().startsWith("Nguyen ") || s.toLowerCase().endsWith(" Tuan")|| s.toLowerCase().contains(" My")|| s.toLowerCase().lastIndexOf(" ") == 0) {
                System.out.println("Ho ten: " + s.toUpperCase());
            }
            System.out.println("Phan tu: " + s.contains(" My"));
            System.out.println("Phan tu: " + s.lastIndexOf(" "));
        }

    }

}
