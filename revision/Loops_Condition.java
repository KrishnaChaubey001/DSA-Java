package revision;
import java.util.Scanner;
public class Loops_Condition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Number: ");
        int n=sc.nextInt();
        int i=0;
        while(i<=n){
            if (i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
