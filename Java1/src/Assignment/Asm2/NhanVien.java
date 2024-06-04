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
        while (true) {
            maNV = scanner.nextLine();
            if (maNV.matches("[A-Z]{2}\\d*$")) {
                break;
            }
            System.out.println("Nhap lai ma nhan vien (du dieu kien AA0000): ");
        }
        System.out.println("Nhap ho ten nhan vien: ");
        while (true) {
            hoTen = scanner.nextLine();
            if (hoTen.matches("[A-Za-z\\s]+")) {
                break;
            }
            System.out.println("Nhap lai ho ten nhan vien (du dieu kien co chua khoang trang): ");
        }
        System.out.println("Nhap luong: ");
        while (true) {
            if (scanner.hasNextDouble()) {
                luong = scanner.nextDouble();
                if (luong >= 0) {
                    break;
                }
                System.out.println("Nhap lai luong (du dieu kien >= 0): ");
            } else {
                System.out.println("Nhap lai luong (du dieu kien so): ");
                scanner.next();
            }
        }
        System.out.println("Nhap tien trach nhiem: ");
        while (true) {
            if (scanner.hasNextDouble()) {
                tienTrachNhiem = scanner.nextDouble();
                if (tienTrachNhiem >= 0) {
                    break;
                }
                System.out.println("Nhap lai tien trach nhiem (du dieu kien >= 0): ");
            } else {
                System.out.println("Nhap lai tien trach nhiem (du dieu kien so): ");
                scanner.next();
            }
        }
    }

    public void xuatThongTin() {
        System.out.println("Ma nhan vien: " + maNV + "\tHo ten nhan vien: " + hoTen + "\tLuong: " + String.format("%.2f", luong) + "\tTien trach nhiem: " + String.format("%.2f", tienTrachNhiem));
        System.out.println("Thu nhap: " + String.format("%.2f", getTinhLuong()));
        System.out.println();
    }
}


