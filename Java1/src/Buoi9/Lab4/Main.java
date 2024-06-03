package Buoi9.Lab4;

public class Main {
    public static void main(String[] args) {
        SanPham sanPham1 = new SanPham("Mi tom", 10000, 10);
        SanPham sanPham2 = new SanPham("sua", 5000, 10);
        sanPham1.nhapThongTin();
        sanPham1.xuatThongTin();
        sanPham2.setTenSP("aaaaaaaaaaaa");
        sanPham2.xuatThongTin();
    }

}
