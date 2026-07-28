package Pattern;
import java.util.Scanner;
public class pt9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
//        int a=1;
//        for (int i = 1; i <= n; i++){
//            int a=i;
//            for(int j=1;j<=i;j++){
//                System.out.print(a+" ");
//                a++;
//            }
//            System.out.println();
//        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i+j+" ");
            }
            System.out.println();
        }
    }
}