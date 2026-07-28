package Pattern;
import java.util.Scanner;
public class pt18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int a = 65+n-1;
        for (int i = 0; i < n; i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)((a-i)+j)+" ");
            }
            System.out.println();
        }
    }
}