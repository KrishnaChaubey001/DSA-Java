package Pattern;
import java.util.Scanner;
public class pt14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        char a = 65;
        for (int i = 0; i < n; i++){
            for(int j=0;j<n;j++){
                System.out.print((char)(a+i+j)+" ");
            }
            System.out.println();
        }
    }
}