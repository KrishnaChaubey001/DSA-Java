package DSA.Arrays.Traversal;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Self_Dividing_Numbers_Solved_728 {
    private static boolean digitCheck(int n){
        int x=n;
        while(n>0){
            int digit=n%10;
            if(digit==0|| x%digit!=0){
                return false;
            }
            n=n/10;
        }
        return true;
    }
    public static ArrayList<Integer> selfdividingnumbers(int left, int right){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(digitCheck(i)){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int left = 1; int right = 22;
        ArrayList result=selfdividingnumbers(left,right);
        System.out.println(result);
    }


}
