package DSA.BinarySearch;
/*
Question:
Given two integers n and m, find the integer nth root of m. Return the root if it exists exactly. Otherwise, return -1.
Example 1:
Input:
int n = 3;
int m = 27;
Output:
3
Explanation:
3 × 3 × 3 = 27.
Example 2:
Input:
int n = 4;
int m = 16;
Output:
2
Explanation:
2 × 2 × 2 × 2 = 16.
Example 3:
Input:
int n = 3;
int m = 20;
Output:
-1
Explanation:
There is no integer x such that x³ = 20.
--------------------------------------------------
*/
public class BS87_NthRootOfANumber {
    public static int findRoot(int n,int mid,int m){
        long ans=1;
        for(int i=0;i<n;i++){
            ans*=mid;
            if(ans>m){
                return 1;
            }
        }
        if(ans==m) return 0;
        else return -1;
    }
    public static int nthRootNumber(int n,int m){
        if(m==1) return 1;
        int low=2;int high=m/n;
        while(low<=high){
            int mid=low+(high-low)/2;
            int root=findRoot(n,mid,m);
            if(root==0) return mid;
            else if(root==-1)low=mid+1;
            else high=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        System.out.println(nthRootNumber(n,m));
        int n1 = 4;
        int m1 = 16;
        System.out.println(nthRootNumber(n1,m1));
    }
}
