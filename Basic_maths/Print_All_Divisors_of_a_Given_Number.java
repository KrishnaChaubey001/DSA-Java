package DSA.Basic_maths;
import java.util.ArrayList;
import java.util.Collections;
public class Print_All_Divisors_of_a_Given_Number {
    public static ArrayList<Integer> printDivisors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i * i<=n; i++){
            if(n % i == 0){
                list.add(i);
                if(i != n/i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args){
        int n = 36;
        ArrayList result=printDivisors(n);
        System.out.println(result);;

    }
}