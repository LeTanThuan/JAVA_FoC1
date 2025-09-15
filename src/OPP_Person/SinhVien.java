package OPP_Person;

import java.util.Scanner;

public class SinhVien extends Person {

    private String maSinhVien;
    private String renLuyen;

    public SinhVien() {

    }

    public SinhVien(String maSinhVien, String renLuyen) {
        this.maSinhVien = maSinhVien;
        this.renLuyen = renLuyen;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    public String getRenLuyen(){
        return renLuyen;
    }
   public void setRenLuyen(String renLuyen){
       this.renLuyen = renLuyen;
   }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ma Sinh Vien: ");
        setMaSinhVien(scanner.nextLine());
        this.danhGiaRenLuyen();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println(", Ma Sinh Vien: " + getMaSinhVien()+", Danh Gia Ren Luyen: "+getRenLuyen());
    }

    public void danhGiaRenLuyen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh Gia Ren Luyen: \n1. Gioi \n2. Kha \n3. Trung Binh \n4. Yeu");
        System.out.print("Moi Ban Nhap Danh Gia:");
        int danhGia = Integer.parseInt(scanner.nextLine());

        switch (danhGia) {
            case 1:
                System.out.println("Gioi");
                break;
            case 2:
                System.out.println("Kha");
                break;
            case 3:
                System.out.println("Trung Binh");
                break;
            case 4:
                System.out.println("Yeu");
                break;
            default:
                System.out.println("Loi!");
        }
    }
}
