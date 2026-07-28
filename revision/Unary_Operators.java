package revision;
import java.util.Scanner;
public class Unary_Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number = ");
        int n=sc.nextInt();
        int i=++n;
        System.out.println("print number pre-increament "+i);
        int j=n++;
        System.out.println("print number post-increament "+j);
        System.out.println("Now the value of number is "+n);

    }
}
