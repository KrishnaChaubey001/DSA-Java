package DSA.Arrays.Traversal;
/*
Question:
Given a sorted array nums, remove duplicates in-place such that each unique element appears only once.
Return the number of unique elements.

Test Case 1
int[] nums = {1,1,2};

Test Case 2
int[] nums = {0,0,1,1,1,2,2,3,3,4};

Test Case 3
int[] nums = {1,1,1,1};

Output:
2
5
1
 */
public class A15_RemoveDuplicatesFromSortedArray_26 {
    public static int removeDuplicates(int nums[]){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return (i+1);

    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int a=removeDuplicates(nums);
        System.out.println(a);
    }

}
