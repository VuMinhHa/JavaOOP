package Assignment.Asm2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class NhanVienService {
    ArrayList<NhanVien> danhSachNhanViens = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    NhanVien nhanVien = new NhanVien();

    public void menu() {
        fakeData();
        int luaChon;
        do {
            System.out.println("|----------------------------Menu---------------------------|");
            System.out.println("| 1. Nhập thông tin nhân viên.                              |");
            System.out.println("| 2. Xuất thông tin nhân viên.                              |");
            System.out.println("| 3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.    |");
            System.out.println("| 4. Xóa nhân viên theo mã nhập từ bàn phím.                |");
            System.out.println("| 5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím. |");
            System.out.println("| 6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.  |");
            System.out.println("| 7. Sắp xếp nhân viên theo họ và tên.                      |");
            System.out.println("| 8. Sắp xếp nhân viên theo thu nhập giảm dần.              |");
            System.out.println("| 9. Xuất 5 nhân viên có thu nhập cao nhất.                 |");
            System.out.println("| 0. Thoát                                                  |");
            System.out.println("|-----------------------------------------------------------|");
            System.out.println("Chọn chức năng [1-9]:");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            switch (luaChon) {
                case 1:
                    nhapDanhSachNhanVien();
                    break;
                case 2:
                    xuatDanhSachNhanVien();
                    break;
                case 3:
                    timVaXuatNhanVien();
                    break;
                case 4:
                    xoaNhanVienTheoMa();
                    break;
                case 5:
                    capNhatNhanVienTheoMa();
                    break;
                case 6:
                    timNhanVienTheoKhoangLuong();
                    break;
                case 7:
                    sapXepTheoHoTen();
                    break;
                case 8:
                    sapXepTheoThuNhap();
                    break;
                case 9:
                    xuat5NhanVienCoThuNhapCaoNhat();
                    break;
                case 0:
                    System.out.println("Đã thoát.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (true);
    }

    private void xuat5NhanVienCoThuNhapCaoNhat() {
        sapXepGiamDan();
        // Xuất thông tin của 5 nhân viên đầu tiên
        System.out.println("5 nhân viên có thu nhập cao nhất:");
        for (int i = 0; i < 5 && i < danhSachNhanViens.size(); i++) {
            System.out.println((i + 1) + ". ");
            danhSachNhanViens.get(i).xuatThongTin();
        }
    }

    private void sapXepGiamDan() {
        danhSachNhanViens.sort(new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                double thuNhap1 = o1.getLuong() + o1.getTienTrachNhiem();
                double thuNhap2 = o2.getLuong() + o2.getTienTrachNhiem();
                return Double.compare(thuNhap2, thuNhap1);
            }
        });
    }

    private void sapXepTheoThuNhap() {
        sapXepGiamDan();
        xuatDanhSachNhanVien();
    }

    private void sapXepTheoHoTen() {
        danhSachNhanViens.sort(Comparator.comparing(NhanVien::getHoTen));
        xuatDanhSachNhanVien();
    }

    private void timNhanVienTheoKhoangLuong() {
        System.out.println("Khoang luong toi thieu: ");
        double khoangLuongToiThieu = scanner.nextDouble();
        System.out.println("Khoang luong toi da: ");
        double khoangLuongToiDa = scanner.nextDouble();
        for (NhanVien danhSachNhanVien : danhSachNhanViens) {
            if (danhSachNhanVien.getLuong() >= khoangLuongToiThieu && danhSachNhanVien.getLuong() <= khoangLuongToiDa) {
                danhSachNhanVien.xuatThongTin();
            }
        }
    }

    private void capNhatNhanVienTheoMa() {
        System.out.println("Nhap ma nhan vien can sua: ");
        String maNhanVien = scanner.nextLine();
        for (NhanVien danhSachNhanVien : danhSachNhanViens) {
            if (danhSachNhanVien.getMaNV().equalsIgnoreCase(maNhanVien)) {
                System.out.println("Nhập họ tên mới: ");
                danhSachNhanVien.setHoTen(scanner.nextLine());
                System.out.println("Nhập lương mới: ");
                danhSachNhanVien.setLuong(scanner.nextDouble());
                System.out.println("Nhập tiền trạch nhiệm mới: ");
                danhSachNhanVien.setTienTrachNhiem(scanner.nextDouble());
                System.out.println("Đã cập nhật nhân viên: " + maNhanVien);
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien voi ma: " + maNhanVien);
    }

    private void xoaNhanVienTheoMa() {
        System.out.println("Nhập mã nhân viên cần xóa: ");
        String maNhanVien = scanner.nextLine();
        for (NhanVien danhSachNhanVien : danhSachNhanViens) {
            if (danhSachNhanVien.getMaNV().equalsIgnoreCase(maNhanVien)) {
                danhSachNhanViens.remove(danhSachNhanVien);
                System.out.println("Da xoa nhan vien thanh cong ma: " + maNhanVien);
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien voi ma: " + maNhanVien);
    }

    private void timVaXuatNhanVien() {
        System.out.println("Nhap ma nhan vien can tim: ");
        String maNhanVien = scanner.next();
        for (NhanVien nhanVien : danhSachNhanViens) {
            if (nhanVien.getMaNV().equalsIgnoreCase(maNhanVien)) {
                nhanVien.xuatThongTin();
            }
        }
    }

    private void xuatDanhSachNhanVien() {
        System.out.println(" DANH SACH NHAN VIEN ");
        for (NhanVien danhSachNhanVien : danhSachNhanViens) {
            danhSachNhanVien.xuatThongTin();
        }
    }

    private void nhapDanhSachNhanVien() {
        do {
            nhanVien.nhapThongTin();
            danhSachNhanViens.add(nhanVien);
            System.out.println("Bạn có muốn nhập tiếp không? (1.Yes/2.No)");
        } while (scanner.nextInt() == 1);
    }

    private void fakeData() {
        danhSachNhanViens.add(new NhanVien("NV05", "Nguyen Van E", 50000, 600));
        danhSachNhanViens.add(new NhanVien("NV01", "Nguyen Van A", 10000, 200));
        danhSachNhanViens.add(new NhanVien("NV03", "Nguyen Van C", 30000, 400));
        danhSachNhanViens.add(new NhanVien("NV02", "Nguyen Van B", 20000, 300));
        danhSachNhanViens.add(new NhanVien("NV04", "Nguyen Van D", 40000, 500));
        danhSachNhanViens.add(new NhanVien("NV07", "Nguyen Van F", 70000, 700));
        danhSachNhanViens.add(new NhanVien("NV08", "Nguyen Van G", 80000, 800));
    }
}
