package DSA.revision.day3;
/*
Question:
You are given an integer array height where each element represents the height
of a vertical line.

Find two lines that together with the x-axis form a container
that can store the maximum amount of water.

Return the maximum amount of water.

Example 1:
Input:
int[] height = {1,8,6,2,5,4,8,3,7};

Output:
49

Explanation:
Choose heights 8 and 7.
Width = 7
Area = 7 × 7 = 49

Example 2:
Input:
int[] height = {1,1};

Output:
1
--------------------------------------------------
*/
public class Q3_ContainerWithMostWater_11 {
    public static int maxArea(int[] nums) {
        int i=0,max=0;int j=nums.length-1;
        while(i<j){
            if(nums[i]<=nums[j]){
                max=Math.max(max,nums[i]*(j-i));
                i++;
            }else{
                max=Math.max(max,nums[j]*(j-i));
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
