package Assignment.Asm2;

public class Patern {
    public boolean kiemTraMa(String sc) {
        String pattern = "[a-zA-Z]{2}\\d{5}"; //2 ký tự và 5 chữ số VD: PH22172
        return sc.matches(pattern);
    }

    //Validate ten nhan vien
    public boolean kiemTraTen(String sc) {
        String pattern = "[\\p{L}\\s]{1,30}"; //La chu tu 1-30 ky tu
        return sc.matches(pattern);
    }
}
