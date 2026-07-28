package DSA.TwoPointers;

/*
Question:
Given n non-negative integers height where each represents a point at coordinate (i, height[i]).
Find two lines that together with the x-axis form a container that contains the most water.
Example 1:
Input:
int[] height = {1,8,6,2,5,4,8,3,7};
Output:
49
Explanation:
The maximum area is formed between heights 8 and 7.
Example 2:
Input:
int[] height = {1,1};
Output:
1
Explanation:
Width = 1
Height = 1
Area = 1
Example 3:
Input:
int[] height = {4,3,2,1,4};
Output:
16
Explanation:
Width = 4
Height = 4
Area = 16
 */
public class A27_ContainerWithMostWater_11 {
    public static int maxArea(int[] height) {
        int i=0;int j=height.length-1;int maxArea=0;
        while(i<j){
            if(height[i]<=height[j]){
                int area=height[i]*(j-i);
                maxArea=Math.max(maxArea,area);
                i++;
            }else{
                int area=height[j]*(j-i);
                maxArea=Math.max(maxArea,area);
                j--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
        int[] height1 = {1,1};
        System.out.println(maxArea(height1));
    }

}
