package Pattern;
import java.util.Scanner;
public class pt23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for(int s=0;s<n-i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}