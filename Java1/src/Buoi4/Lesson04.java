package Buoi4;

import java.util.Scanner;

/**
 * @author vha74
 */
public class Lesson04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hiển thị menu
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. tổng từ 1 đến N, in ra màn hình");
            System.out.println("2. tổng các số lẻ từ 1 đến N, in ra màn hình.");
            System.out.println("3. tổng các số lẻ và tổng các số chẵn từ 1 đến N, in ra màn hình 2 kết quả");
            System.out.println("4. chương trình để in ra bảng cửu chương của 7");
            System.out.println("5. hương trình nhập vào số nguyên N và kiểm tra N có phải là số nguyên tố");
            System.out.println("6. chương trình in ra toàn bộ bảng cửu chương từ 1 đến 10");
            System.out.println("7. chương trình nhập vào số nguyên N, in ra các số nguyên tố trong phạm vi từ 1 đến N.");
            System.out.println("8. tim max");
            System.out.println("0. Thoát");

            // Nhập lựa chọn từ người dùng
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            // Xử lý lựa chọn của người dùng
            switch (choice) {
                case 1:
                    bai1();
                    break;
                case 2:
                    bai2();
                    break;
                case 3:
                    bai3();
                    break;
                case 4:
                    bai4();
                    break;
                case 5:
                    bai5();
                    break;
                case 6:
                    bai6();
                    break;
                case 7:
                    bai7();
                    break;
                case 8:
                    bai8();
                    break;
                case 0:
                    System.out.println("Đã thoát.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    public static void bai1() {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương N từ bàn phím
        System.out.print("Nhập vào số nguyên dương N: ");
        int N = scanner.nextInt();

        // Kiểm tra nếu N không phải số nguyên dương
        if (N <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương!");
            return; // Kết thúc chương trình
        }

        // Tính tổng từ 1 đến N
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        // In ra tổng
        System.out.println("Tổng từ 1 đến " + N + " là: " + sum);
    }

    public static void bai2() {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương N từ bàn phím
        System.out.print("Nhập vào số nguyên dương N: ");
        int N = scanner.nextInt();

        // Kiểm tra nếu N không phải số nguyên dương
        if (N <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương!");
            return; // Kết thúc chương trình
        }

        // Tính tổng các số lẻ từ 1 đến N
        int sum = 0;
        for (int i = 1; i <= N; i += 2) {
            sum += i;
        }

        // In ra tổng
        System.out.println("Tổng các số lẻ từ 1 đến " + N + " là: " + sum);
    }

    public static void bai3() {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương N từ bàn phím
        System.out.print("Nhập vào số nguyên dương N: ");
        int N = scanner.nextInt();

        // Kiểm tra nếu N không phải số nguyên dương
        if (N <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương!");
            return; // Kết thúc chương trình
        }

        // Tính tổng các số lẻ và tổng các số chẵn từ 1 đến N
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        // In ra tổng các số lẻ và tổng các số chẵn
        System.out.println("Tổng các số lẻ từ 1 đến " + N + " là: " + sumOdd);
        System.out.println("Tổng các số chẵn từ 1 đến " + N + " là: " + sumEven);
    }

    //Bang cuu chuong 7
    public static void bai4() {
        int n = 7;
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "x" + n + "=" + (n * i));
        }
    }

    public static void bai5() {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên N từ bàn phím
        System.out.print("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        // Kiểm tra nếu N là số nguyên tố
        if (isPrime(N)) {
            System.out.println(N + " là số nguyên tố.");
        } else {
            System.out.println(N + " không là số nguyên tố.");
        }
    }

    public static void bai6() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }

    public static void bai7() {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên N từ bàn phím
        System.out.print("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        System.out.println("Các số nguyên tố từ 1 đến " + N + " là:");
        // Dùng vòng lặp để kiểm tra từng số trong phạm vi từ 1 đến N
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Phương thức kiểm tra số nguyên tố
    public static boolean isPrime(int number) {
        // Nếu số đầu vào nhỏ hơn 2, không phải là số nguyên tố
        if (number < 2) {
            return false;
        }

        // Kiểm tra từ 2 đến số đó - 1
        for (int i = 2; i < number; i++) {
            // Nếu số đó chia hết cho một số khác 1 và chính nó
            if (number % i == 0)
                return false; // Không phải là số nguyên tố

        }

        // Nếu không có số nào chia hết, là số nguyên tố
        return true;
    }

    //Tim max
    public static void bai8() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A = ");
        int a = scanner.nextInt();
        System.out.println("B = ");
        int b = scanner.nextInt();
        System.out.println("C = ");
        int c = scanner.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Gia tri max la : " + max);
    }


}
