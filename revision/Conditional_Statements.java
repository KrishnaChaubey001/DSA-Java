package revision;
import java.util.Scanner;
public class Conditional_Statements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number = ");
        float n=sc.nextFloat();
        if (n==0){
            System.out.println("Number is Zero");
        }
        else if(n>0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }
    }
}
