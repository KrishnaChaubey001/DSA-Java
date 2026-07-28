package DSA.Hashing;

import java.util.Scanner;

public class Occurence {
    public static int  appearance(int []arr,int q){
        int freq[]=new int[1000001];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        if(q>freq.length)return 0;
        return freq[q];
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter array: ");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter queries: ");
        int queries=sc.nextInt();
        while(queries-- >0){
            int q=sc.nextInt();
            System.out.println(appearance(arr,q));
        }
    }
}
