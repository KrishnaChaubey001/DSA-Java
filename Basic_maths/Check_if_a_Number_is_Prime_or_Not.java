package DSA.Basic_maths;

public class Check_if_a_Number_is_Prime_or_Not {
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i*i <=n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int n = 7;
        if(isPrime(n)){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}