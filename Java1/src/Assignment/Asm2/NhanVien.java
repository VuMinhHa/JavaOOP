package Assignment.Asm2;

import java.util.Scanner;

public class NhanVien {
    private String maNV;
    private String hoTen;
    private double luong;
    private double tienTrachNhiem;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, double luong, double tienTrachNhiem) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
        this.tienTrachNhiem = tienTrachNhiem;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getTienTrachNhiem() {
        return tienTrachNhiem;
    }

    public void setTienTrachNhiem(double tienTrachNhiem) {
        this.tienTrachNhiem = tienTrachNhiem;
    }

    public double getTinhLuong() {
        return luong + tienTrachNhiem;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien: ");
        maNV = scanner.nextLine();
        System.out.println("Nhap ho ten nhan vien: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhap luong: ");
        luong = scanner.nextDouble();
        System.out.println("Nhap tien trach nhiem: ");
        tienTrachNhiem = scanner.nextDouble();
    }

    public void xuatThongTin() {
        System.out.println("Ma nhan vien: " + maNV);
        System.out.println("Ho ten nhan vien: " + hoTen);
        System.out.println("Luong: " + luong);
        System.out.println("Tien trach nhiem: " + tienTrachNhiem);
        System.out.println("Thu nhap: " + getTinhLuong());
        System.out.println();
    }
}
