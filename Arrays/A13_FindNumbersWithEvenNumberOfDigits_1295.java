package DSA.Arrays.Traversal;
/*
Question:
Given an array nums of integers, return how many of them contain an even number of digits.

Test Case 1
int[] nums = {12,345,2,6,7896};

Test Case 2
int[] nums = {555,901,482,1771};

Test Case 3
int[] nums = {10,100,1000,10000};

Output:
2
1
2
 */
public class A13_FindNumbersWithEvenNumberOfDigits_1295 {

    public static int evenDigitCount(int[] nums){

        int sum = 0;

        for(int i = 0; i < nums.length; i++){

            int count = 0;

            int n = nums[i];

            while(n > 0){

                count++;

                n = n / 10;
            }

            if(count % 2 == 0){
                sum++;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};

        int result = evenDigitCount(nums);

        System.out.println(result);
    }
}