package DSA.Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/*
Question:
Given an integer array and a window size K, find the first negative number
in every contiguous window of size K.
If a window does not contain a negative number, output 0.
Input:
        int[] arr1 = {12, -1, -7, 8, -15, 30, 16, 28};
        int k1 = 3;
        int[] arr2 = {1, 2, 3, 4, 5};
        int k2 = 2;
        int[] arr3 = {-1, 2, -3, 4, -5};
        int k3 = 2;
Example 1:
Output:
        [-1, -1, -7, -15, -15, 0]
Explanation:
        For each window of size 3, find the first negative number.
Example 2:
Output:
        [0, 0, 0, 0]
Explanation:
        None of the windows contains a negative number.
Example 3:
Output:
        [-1, -3, -3, -5]
Explanation:
        The first negative element of each window is returned.
--------------------------------------------------
*/
public class Q184_FirstNegativeNumberInEveryWindow {
    public static List<Integer> firstNegativeNumberInEveryWindow(int  nums[],int k){
        Queue<Integer>q=new ArrayDeque<>();
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        for(int j=0;j<nums.length;){
            if(nums[j]<0) q.offer(nums[j]);
            if(j-i+1<k) j++;
            else{
                if(q.isEmpty()) list.add(0);
                else list.add(q.peek());
                if(!q.isEmpty() && q.peek()==nums[i]){
                    q.poll();
                }
                i++;
                j++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, -1, -7, 8, -15, 30, 16, 28};
        int k1 = 3;
        int[] arr2 = {1, 2, 3, 4, 5};
        int k2 = 2;
        int[] arr3 = {-1, 2, -3, 4, -5};
        int k3 = 2;
        System.out.println(firstNegativeNumberInEveryWindow(arr1,k1));
        System.out.println(firstNegativeNumberInEveryWindow(arr2,k2));
        System.out.println(firstNegativeNumberInEveryWindow(arr3,k3));
    }
}
