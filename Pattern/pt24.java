package Pattern;
import java.util.Scanner;
public class pt24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int a=1;
        for (int i = 1; i <= n; i++){
            for(int s=0;s<n-i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}