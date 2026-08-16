package DSA.BinarySearch;
/*
Question:
Given an array of books where nums[i] represents the number of pages in the ith book and an integer students,
allocate the books to students such that each student gets at least one book, books are allocated
in contiguous order, and the maximum number of pages assigned to any student is minimized.
Return -1 if there are fewer books than students.
Example 1:
Input:
int[] pages = {12,34,67,90};
int students = 2;
Output:
113
Explanation:
The optimal allocation is [12,34,67] and [90]. The maximum pages assigned to a student is 113.
Example 2:
Input:
int[] pages = {10,20,30,40};
int students = 2;
Output:
60
Explanation:
The optimal allocation is [10,20,30] and [40]. The maximum pages assigned to a student is 60.
Example 3:
Input:
int[] pages = {10,20,30};
int students = 4;
Output:
-1
Explanation:
There are fewer books than students, so allocation is impossible.
--------------------------------------------------
*/
public class BS84_AllocateMinimumPages {
    public static int allocateMinimumPages(int nums[],int k){
        if(nums.length<k)return -1;
        int low=nums[0],high=0;
        for(int n:nums){
            high+=n;
            if(n>low){
                low=n;
            }
        }
        while(low<=high){
            int mid=(low+high)/2;
            int sum=0,student=1;
            for(int n:nums){
                sum+=n;
                if(sum>mid){
                    student++;
                    sum=n;
                }
            }
            if(student>k) low=mid+1;
            else high=mid-1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] pages = {12,34,67,90};
        int students = 2;
        System.out.println(allocateMinimumPages(pages,students));
        int[] p = {10,20,30};
        int s = 4;
        System.out.println(allocateMinimumPages(p,s));
        int[] pages1 = {10,20,30,40};
        int student1 = 2;
        System.out.println(allocateMinimumPages(pages1,student1));
    }
}
