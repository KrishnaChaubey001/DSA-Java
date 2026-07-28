package revision;

import java.util.Scanner;

public class Arithmetic_Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a =  ");
        int a=sc.nextInt();
        System.out.print("b = ");
        int b=sc.nextInt();
        System.out.println("Now perform all Arithmatic Operations");
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        float div=a/b;
        int mod=a%b;
        System.out.println("Sum = "+sum+"\nSubtract = "+sub+"\nMultiply = "+mul+"\nDivision = "+div+"\nModolus = "+mod);
    }
}
