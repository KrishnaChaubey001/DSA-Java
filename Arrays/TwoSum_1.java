package DSA.Arrays.Traversal;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {
    public static int [] twosum( int arr[], int target){
        HashMap<Integer,Integer> set=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int j=target-arr[i];
            if(set.containsKey(j)){
                return new int[]{set.get(j),i};
            }
            set.put(arr[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        int [] result=twosum(nums,target);
        System.out.println(Arrays.toString(result));
    }

}
