package revision;
import java.util.Scanner;
public class Relational_Logical_Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a=");
        int a=sc.nextInt();
        System.out.print("b=");
        int b=sc.nextInt();
        System.out.print("c=");
        int c= sc.nextInt();
        if((a>=b)&&(a>=c)){
            System.out.println("a is the greatest number among them");
        }
        else if((b>=a)&&(b>=c)){
            System.out.println("b is the greatest number among them");
        }
        else{
            System.out.println("c is the greatest number among them");
        }
    }
}
