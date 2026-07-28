package DSA.Basic_maths;

public class Check_if_the_Number_is_Armstrong_or_Not {
    public static boolean isArmstrong(int n){
        int temp = n;
        int digits = (int)Math.log10(n) + 1;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n = n / 10;
        }
        return (sum == temp);
    }

    public static void main(String[] args){
        int n = 153;
        if(isArmstrong(n)){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}