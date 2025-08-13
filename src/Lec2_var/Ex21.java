package Lec2_var;

public class Ex21 {
    public static void main(String[] args){
        int x=1;
        int y= x+ ++x - x-- - x++ + x - x--;
        System.out.println("Dap an x = "+ x);
        System.out.println("Dap an y = "+ y);
    }
}
