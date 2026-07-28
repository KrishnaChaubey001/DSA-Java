package DSA.Arrays.Traversal;

public class findGCD_MAX_MIN_1979 {
    public static int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        while(min!=0){
            int temp=min;
            min=max%min;
            max=temp;
        }
        return max;
    }

    public static void main(String[] args) {
        int [] nums = {2,5,6,9,10};
        int result= findGCD(nums);
        System.out.println(result);
    }
}
