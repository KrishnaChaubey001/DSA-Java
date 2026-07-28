package DSA.BasicRecursion;

public class Print_Name_N_Times_Using_Recursion {
    public static void CallingName(String name,int count,int n){
        if(count>=n){
            return;
        }
        System.out.print(name+" ");
        count++;
        CallingName(name,count++,n);
    }

    public static void main(String[] args) {
        String name="Krishna";
        int n=5;
        CallingName(name,0,n);
    }

}
