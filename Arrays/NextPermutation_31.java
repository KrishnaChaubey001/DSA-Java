package DSA.Arrays.Traversal;

import java.util.Arrays;

public class NextPermutation_31 {

    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot = -1;

        // Step 1: Find Pivot
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] < arr[i + 1]){
                pivot = i;
                break;
            }
        }

        // Step 2: Swap if pivot found
        if(pivot != -1){
            for(int j = n - 1; j > pivot; j--){
                if(arr[j] > arr[pivot]){
                    swap(arr, j, pivot);
                    break;
                }
            }
        }

        // Step 3: Reverse suffix
        int start = pivot + 1;
        int end = n - 1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};

        NextPermutation_31 obj = new NextPermutation_31();
        obj.nextPermutation(arr);

        System.out.println(Arrays.toString(arr));
    }
}