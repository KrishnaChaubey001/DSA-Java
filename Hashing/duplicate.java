package DSA.Hashing;

public class duplicate {

    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,6,6};

        int hash[]=new int[100001];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;

        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]>1){
                System.out.println(i);
            }
        }
    }

}
