package DSA.Arrays.Traversal;
/*'
Question:
Given an integer array nums, return the third distinct maximum number in the array.
If the third maximum does not exist, return the maximum number.

Test Case 1
int[] nums = {3,2,1};

Test Case 2
int[] nums = {1,2};

Test Case 3
int[] nums = {2,2,3,1};

Output:
1
2
1
 */
public class A14_ThirdMaximumNumber_414 {
    public static int thirdmax(int nums[]){
        long first=Long.MIN_VALUE;
        long second=Long.MIN_VALUE;
        long third=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(n==first||n==second||n==third){
                continue;
            }
            if(n>first){
                third=second;
                second=first;
                first=n;
            }else if(n>second){
                third=second;
                second=n;
            }else if(n>third){
                third=n;
            }
        }

        if(third==Long.MIN_VALUE){
            return (int)first;
        }else{
            return (int)third;
        }

    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        System.out.println(thirdmax(nums));
    }
}
