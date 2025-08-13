package Lec2_var;

public class Ex22 {
    public static void main(String[] args){
        int x=1;
        int z= x - x-- - x++ + --x -x +x-- +x;
        System.out.println("Dap an x = "+ x);
        System.out.println("Dap an z = "+ z);
    }
}
