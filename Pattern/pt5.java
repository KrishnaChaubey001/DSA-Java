package Pattern;
import java.util.Scanner;
public class pt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int a=n*n;
        for (int i = 0; i < n; i++){
            for(int j=1;j<=n;j++){
                System.out.print(a+" ");
                a--;
            }
            System.out.println();
        }
    }
}