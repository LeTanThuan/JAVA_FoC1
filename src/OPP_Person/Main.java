package OPP_Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DanhSachNguoi danhSachNguoi = new DanhSachNguoi();
        Scanner scanner = new Scanner(System.in);
        int luaChonTiepTuc;

        do {
            System.out.print("\nMenu");
            System.out.print("\n0. Thoat Chuong Trinh");
            System.out.print("\n1. Nhap Thong Tin (Sinh Vien or Giao Vien)");
            System.out.print("\n2. Xuat Thong Tin");
            System.out.print("\nMoi Ban Chon: ");
            luaChonTiepTuc = Integer.parseInt(scanner.nextLine());
            switch (luaChonTiepTuc) {
                case 1:
                    System.out.print("Them Sinh Vien Hay Giao Vien!");
                    System.out.print("\n1. Sinh Vien");
                    System.out.print("\n2. Giao Vien");
                    System.out.print("\nMoi Ban Chon nhap nguoi nao? ");
                    int luaChon = Integer.parseInt(scanner.nextLine());
                switch (luaChon) {
                    case 1:
                        SinhVien sinhVien = new SinhVien();
                        danhSachNguoi.themDanhSach(sinhVien);
                        break;
                    case 2:
                        GiaoVien giaoVien = new GiaoVien();
                        danhSachNguoi.themDanhSach(giaoVien);
                        break;
                    default:
                        System.out.println("Nhap Sai");
                        break;
                }
                    break;

                case 2:
                    danhSachNguoi.xuatDanhSach();
                    break;
            }
            System.out.print("\n1. Tiep Tuc\n0. Dung Lai");
            System.out.print("Moi Ban Nhap: ");
            luaChonTiepTuc = Integer.parseInt(scanner.nextLine());
        } while (luaChonTiepTuc != 0);

    }
}
