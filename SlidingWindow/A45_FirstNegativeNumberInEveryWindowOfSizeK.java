package DSA.SlidingWindow;

import java.util.LinkedList;
import java.util.Queue;

/*
Question:
Given an array nums and an integer k, find the first negative number in every window of size k.
Example 1:
Input:
int[] nums = {-8,2,3,-6,10};
int k = 2;
Output:
-8 0 -6 -6
Explanation:
Window 1:
-8 2 → -8
Window 2:
2 3 → 0
Window 3:
3 -6 → -6
Window 4:
-6 10 → -6
Example 2:
Input:
int[] nums = {1,2,3,4};
int k = 3;
Output:
0 0
-------
 */
public class A45_FirstNegativeNumberInEveryWindowOfSizeK {
    /// Brute Force;
    public static void negativeElementBruteForce(int nums[],int k){

        int i=0;
        while(i<=nums.length-k){
            boolean found =false;
            for(int j=i;j<i+k;j++){
                if(nums[j]<0){
                    System.out.print(nums[j]+" ");
                    found=true;
                    break;
                }
            }
            if(!found) System.out.print(0+" ");
            i++;
        }
    }
    public static void negativeElement(int nums[],int k){
        Queue<Integer>queue=new LinkedList<>();
        int i=0,j=0;
        while(j<nums.length){
            if(nums[j]<0) queue.offer(nums[j]);
            if(j-i+1<k) j++;
            else if (j-i+1==k) {
                if(queue.isEmpty()) System.out.print("0 ");
                else System.out.print(queue.peek()+" ");
                if(!queue.isEmpty()&& nums[i]== queue.peek()) queue.poll();
                i++;
                j++;
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = {-8,2,3,-6,10};
        int k=2;
        negativeElementBruteForce(nums,k);
        System.out.println();
        negativeElement(nums,k);
    }

}
