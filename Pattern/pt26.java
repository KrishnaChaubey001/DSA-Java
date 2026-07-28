package Pattern;
import java.util.Scanner;
public class pt26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for(int s=1;s<=n-i+1;s++){
                System.out.print(s+" ");
            }
            for(int s=1;s<i;s++){
                System.out.print("* * ");
            }
            for(int j=n-i+1;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}