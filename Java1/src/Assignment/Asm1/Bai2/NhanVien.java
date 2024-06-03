package Assignment.Asm1.Bai2;

import java.util.Scanner;

/**
 * @author vha74
 */
public class NhanVien {
    private String maNV;
    private String hoTen;
    private Double luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, Double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "\nMã nhân viên : " + maNV + ", Họ tên : " + hoTen + ", " + "Lương : " + luong + ".";
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        maNV = scanner.nextLine();
        while (maNV.trim().isEmpty()) {
            System.out.print("Mã nhân viên không được để trống. Vui lòng nhập lại: ");
            maNV = scanner.nextLine();
        }

        System.out.println("Nhập họ tên nhân viên: ");
        hoTen = scanner.nextLine();
        while (hoTen.trim().isEmpty()) {
            System.out.print("Họ và tên không được để trống. Vui lòng nhập lại: ");
            hoTen = scanner.nextLine();
        }

        System.out.println("Nhập lương nhân viên: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Lương phải là số. Vui lòng nhập lại: ");
            scanner.next();
        }
        luong = scanner.nextDouble();
        while (luong < 0) {
            System.out.print("Lương không được nhỏ hơn 0. Vui lòng nhập lại: ");
            luong = scanner.nextDouble();
        }
    }

}
