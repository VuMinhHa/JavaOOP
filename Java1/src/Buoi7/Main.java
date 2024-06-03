package Buoi7;

import java.util.Scanner;

/**
 * @author vha74
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog = new Dog();
        dog.sua();
        System.out.println(dog.getCanNang());
        dog.hienThiData();
    }
}
