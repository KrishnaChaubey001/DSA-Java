package DSA.BasicRecursion;

public class Print_1_to_N_Using_Recursion {
    public static void PrintNumber(int n,int i){
        if(i>n){
            return;
        }
        System.out.println(i);
        PrintNumber(n,i+1);
    }

    public static void main(String[] args) {
        int n=10;
        PrintNumber(n,1);
    }

}
