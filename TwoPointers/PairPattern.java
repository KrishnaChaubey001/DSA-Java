package DSA.Arrays.Traversal;
/*
Question:
Print:
first-last
second-secondLast
third-thirdLast
Test Case 1
int[] nums = {1, 2, 3, 4, 5, 6};
Output:
1 6
2 5
3 4
Test Case 2
int[] nums = {10, 20, 30, 40};
Output:
10 40
20 30
Test Case 3
int[] nums = {7, 8, 9};
Output:
7 9
8 8
 */
public class PairPattern {
    public static void pair(int nums[]){
        if(nums.length == 0){
            return;
        }
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            System.out.println(nums[i]+" "+nums[j]);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        pair(nums);
        System.out.println("-----------");
        int[] nums1 = {10, 20, 30, 40};
        pair(nums1);
        System.out.println("-----------");
        int[] nums2 = {7, 8, 9};
        pair(nums2);

    }
}
