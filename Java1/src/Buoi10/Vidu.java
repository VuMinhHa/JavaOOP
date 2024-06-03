package Buoi10;

import java.util.ArrayList;
import java.util.Scanner;


public class Vidu {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ban nhap so thuc: ");
            Double x = sc.nextDouble();
            list.add(x);
            System.out.println("ban co nhap tiep k (1.Y/ 2.N)");
        } while (sc.nextInt() == 1);
        double sum = 0;
        for (Double v : list) {
            sum += v;
        }
        System.out.println("Danh sach so da nhap vao" + list);
        System.out.println("Tong cac so nhap vao: " + sum);
    }
}
