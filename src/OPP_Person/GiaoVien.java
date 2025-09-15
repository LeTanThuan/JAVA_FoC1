
package OPP_Person;
import java.util.Scanner;

public class GiaoVien extends Person{
    private String maGiaoVien;
    private String xepLoaiThiDua;
    
    public GiaoVien(){
        
    }
    public GiaoVien(String maGiaoVien, String xepLoaiThiDua){
        this.maGiaoVien = maGiaoVien;
        this.xepLoaiThiDua = xepLoaiThiDua;
    }
    
    public String getMaGiaoVien(){
        return maGiaoVien;
    }
    public void setMaGiaoVien(String maGiaoVien){
        this.maGiaoVien = maGiaoVien;
    }
    public String getXepLoaiThiDua(){
        return xepLoaiThiDua;
    }
    public void setXepLoaiThiDua(){
        this.xepLoaiThiDua = xepLoaiThiDua;
    }
    
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ma Giao Vien: ");
        setMaGiaoVien(scanner.nextLine());
        this.xepLoaiThiDua();
    }
    @Override 
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.print(", Ma Giao Vien: "+getMaGiaoVien()+", Xep Loai Thi Dua: "+getXepLoaiThiDua());
    }
    

    
    public void xepLoaiThiDua(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon Loai Xep Hang Thi Dua! \n1.Loai A \n2. Loai B \n3. Loai C ");
        System.out.print("Moi Ban Nhap Loai: ");
        int danhGia = Integer.parseInt(scanner.nextLine());
        switch (danhGia){
            case 1 : System.out.println("Thi Dua Loai A"); break;
            
            case 2 : System.out.println("Thi Dua Loai B"); break;
            
            case 3 : System.out.println("Thi Dua Loai C"); break;
            
            default : System.out.println("Loi!");
        }
    }
}
