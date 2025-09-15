
package OPP_Person;

import java.util.ArrayList;


public class DanhSachNguoi {
    ArrayList <Person> danhSachNguoi = new ArrayList<>();
    public void themDanhSach(Person person){
        person.nhapThongTin();
        danhSachNguoi.add(person);
        System.out.println("Them Thanh Cong");
        
    }
    public void xuatDanhSach(){
        if (danhSachNguoi.size() == 0 ){
            System.out.println("Danh Sach Rong");
        }else{
            for (int i=0; i < danhSachNguoi.size(); i++){
                danhSachNguoi.get(i).xuatThongTin();
            }
        }
    }
}
