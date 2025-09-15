package OPP_Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Person {
    
    private String hoVaTen;
    private Date NgaySinh;
    private String gioiTinh;
    private int CMND;

    //contructor
    public Person() {
        
    }
    
    public Person(String hoVaTen, Date NgaySinh, String gioiTinh, int CMND) {
        this.hoVaTen = hoVaTen;
        this.NgaySinh = NgaySinh;
        this.gioiTinh = gioiTinh;
        this.CMND = CMND;
    }
    
    public String getHoVaTen() {
        return hoVaTen;
    }
    
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    
    public Date getNgaySinh() {
        return NgaySinh;
    }
    
    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    
    public String getGioiTinh() {
        return gioiTinh;
    }
    
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public int getCMND() {
        return CMND;
    }
    
    public void setCMND(int CMND) {
        this.CMND = CMND;
    }
    
    public void nhapThongTin() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nNhap Thong Tin:");
            System.out.print("\nNhap Ho Va Ten: ");
            setHoVaTen(scanner.nextLine());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
            System.out.print("\nNhap Ngay Sinh(DD/MM/YYYY): ");
            String NgaySinhString = scanner.nextLine();
            setNgaySinh(sdf.parse(NgaySinhString));
            System.out.print("\nNhap Gioi Tinh: ");
            setGioiTinh(scanner.nextLine());
            System.out.print("\nNhap CMND: ");
            setCMND(Integer.parseInt(scanner.nextLine()));
        } catch (ParseException ex) {
            System.out.println("\nChon Sai! " + ex.getMessage());
        }
    }
    
    public void xuatThongTin() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println("Ho va ten: " + getHoVaTen() + ", Ngay Sinh: " + sdf.format(getNgaySinh()) + ", Gioi Tinh: " + getGioiTinh() + ", CMND: " + getCMND());
    }
}
