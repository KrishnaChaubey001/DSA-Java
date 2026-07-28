package DSA.Basic_maths;

public class Find_GCD_of_Two_Numbers {
    public static int findGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args){
        int a = 12;
        int b = 18;
        int result = findGCD(a,b);
        System.out.println(result);
    }
}