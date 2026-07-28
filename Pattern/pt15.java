package Pattern;
import java.util.Scanner;
public class pt15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        char a = 65;
        for (int i = 0; i < n; i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(a+i)+" ");
            }
            System.out.println();
        }
    }
}