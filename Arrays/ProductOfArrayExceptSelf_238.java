package DSA.Arrays.Traversal;

import java.util.Arrays;

/*
Pattern: Prefix Sum / Prefix & Suffix

Tests:

Input:
nums = {1,2,3,4}

Output:
{24,12,8,6}
 */
public class ProductOfArrayExceptSelf_238 {
    public static int [] productofArray(int nums[]){
        int ans[]=new int [nums.length];
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        int suffix=1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i]=ans[i]*suffix;
            suffix*=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        System.out.println(Arrays.toString(productofArray(nums)));

    }
}
