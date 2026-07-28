package DSA.Basic_maths;
// better solution with time complexity log10N
public class countDigits {
    public static int CountDigits(int n){
        if (n==0) return 1;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
// Optimal Solution with time complexity O(1)
    public static int CountsDigits(int n){
        if(n==0) return 1;
        return (int)Math.log10(n)+1;
    }

    public static void main(String[] args) {
        int n=50000;
        int n1=1;
        int n2=0;
        int result=CountsDigits(n);
        int result1=CountsDigits(n1);
        int result2 =CountsDigits(n2);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);


    }

}
