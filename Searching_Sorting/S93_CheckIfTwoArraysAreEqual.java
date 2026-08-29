package DSA.Searching_Sorting;

import java.util.HashMap;

/*
Question:
Given two integer arrays arr1 and arr2, determine whether both arrays contain the same elements with the same frequencies.
 The order of elements does not matter.
Input:
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {4,3,2,1};

        int[] arr3 = {1,2,2,3};
        int[] arr4 = {1,2,3,3};

        int[] arr5 = {5,5,6};
        int[] arr6 = {6,5,5};
Example 1:
Output:
true
Explanation:
Both arrays contain the same elements with the same frequencies.
Example 2:
Output:
false
Explanation:
The frequencies of 2 and 3 are different.
Example 3:
Output:
true
Explanation:
Both arrays contain the same elements with the same frequencies.
--------------------------------------------------
*/
public class S93_CheckIfTwoArraysAreEqual {
    public static boolean checkIfTwoArraysAreEqual(int nums1[], int nums2[]) {
        if (nums1.length != nums2.length) return false;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int n:nums1){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n:nums2){
            if(!map.containsKey(n)) return false;
            map.put(n,map.get(n)-1);
            if(map.get(n)==0){
                map.remove(n);
            }
        }
        return map.isEmpty();

    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {4,3,2,1};

        int[] arr3 = {1,2,2,3};
        int[] arr4 = {1,2,3,3};

        int[] arr5 = {5,5,6};
        int[] arr6 = {6,5,5};

        int arr7[]={1,2,3};
        int arr8[]={4,5,6};


        System.out.println(checkIfTwoArraysAreEqual(arr1,arr2));
        System.out.println(checkIfTwoArraysAreEqual(arr3,arr4));
        System.out.println(checkIfTwoArraysAreEqual(arr5,arr6));

        System.out.println(checkIfTwoArraysAreEqual(arr7,arr8));

    }
}
