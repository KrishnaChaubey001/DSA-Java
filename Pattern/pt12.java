package Pattern;
import java.util.Scanner;
public class pt12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            for(int j=0;j<n;j++){
                System.out.print((char) (65+j)+" ");
            }
            System.out.println();
        }
    }
}