package Pattern;
import java.util.Scanner;
public class pt25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for(int s=0;s<n-i;s++){
                System.out.print(" "+" ");
            }
            for(int s=1;s<i;s++){
                System.out.print(s+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i-j+1+" ");
            }
            System.out.println();
        }
    }
}