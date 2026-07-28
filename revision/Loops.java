package revision;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum =0;
        System.out.println("The numbers from 1 to 100 sre given below ");
        for (int i=1;i<101;i++){
            System.out.print(i + " ");
            sum= sum+i;
        }
        System.out.println("\nThe Sum of numbers from 1 to 100 is "+sum);
    }
}
