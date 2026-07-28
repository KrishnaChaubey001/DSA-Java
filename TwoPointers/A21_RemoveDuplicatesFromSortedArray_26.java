package DSA.TwoPointers;

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
public class A21_RemoveDuplicatesFromSortedArray_26 {
    public static int uniqueElement(int nums[]){
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        return (j+1);
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k=uniqueElement(nums);
        System.out.println(k);
        for (int i=0;i<nums.length;i++){
            if(i<k){
                System.out.print(i+" ");
            }else{
                System.out.print("_"+" ");
            }
        }
    }
}
