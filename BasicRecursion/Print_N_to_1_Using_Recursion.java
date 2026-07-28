package DSA.BasicRecursion;

public class Print_N_to_1_Using_Recursion {
    public static void PrintNumber(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        PrintNumber(n-1);
    }

    public static void main(String[] args) {
        int n=10;
        PrintNumber(n);
    }

}
