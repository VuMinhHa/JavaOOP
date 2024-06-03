package Assignment.Asm1;

import java.util.Scanner;


/**
 * @author vha74
 */
public class TinhTienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soDien;

        do {
            System.out.println("Số điện tiêu thụ hàng tháng: ");
            soDien = scanner.nextDouble();

            if (soDien < 0) {
                System.out.println("Số điện không hợp lệ. Vui lòng nhập lại!");
            }
        } while (soDien < 0);

        double tongTien = tinhTienDien(soDien);
        System.out.println("Số tiền cần phải đóng: " + tongTien + " VNĐ");
    }

    public static double tinhTienDien(double soDien) {
        double tongTien;
        if (soDien < 50) {
            tongTien = soDien * 1678;
        } else if (soDien <= 100) {
            tongTien = 50 * 1678 + (soDien - 50) * 1734;
        } else if (soDien <= 200) {
            tongTien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
        } else if (soDien <= 300) {
            tongTien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
        } else if (soDien <= 400) {
            tongTien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soDien - 300) * 2834;
        } else {
            tongTien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (soDien - 400) * 2927;
        }
        return tongTien;
    }
}
