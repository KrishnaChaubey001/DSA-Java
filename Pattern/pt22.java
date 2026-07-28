package Pattern;
import java.util.Scanner;
public class pt22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for(int s=1;s<i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}