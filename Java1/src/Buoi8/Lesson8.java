package Buoi8;

import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        int[] a = new int[]{6,2,5,8,5};

        Scanner scanner = new Scanner(System.in);

//        for (int i = 0; i < a.length; i++) {
//            System.out.println("Moi nhap phan tu thu " + (i + 1));
//            a[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        for (int x : a){
            System.out.println(x);
        }
    }
}
