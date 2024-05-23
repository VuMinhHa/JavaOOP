package Buoi7;

public class Dog {
    public double canNang;
    public String loai;
    public String ten;

    public void sua() {
        System.out.println("Ang ang ang");
    }

    public Dog() {
        this.canNang = 1;
        this.loai = "huhuchocho";
        this.ten = "Meo";
    }

    public Dog(double canNang, String loai, String ten) {
        this.canNang = canNang;
        this.loai = loai;
        this.ten = ten;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void hienThiData() {
        System.out.println("Dog{" +
                "canNang=" + this.canNang +
                ", loai='" + this.loai + '\'' +
                ", ten='" + this.ten + '\'' +
                '}');
    }
}
