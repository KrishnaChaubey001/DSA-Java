package DSA.TwoPointers;
/*
Question:
Write a function that reverses a character array.

Test Case 1
char[] s = {'h','e','l','l','o'};

Test Case 2
char[] s = {'H','a','n','n','a','h'};

Test Case 3
char[] s = {'a','b','c'};

Output:
o l l e h
h a n n a H
c b a
--------
 */
public class A19_ReverseString_344 {
    public static void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp=s[j];
            s[j]=s[i];
            s[i]=temp;
            i++;
            j--;
        }
        for(int k=0;k<s.length;k++){
            System.out.print(s[k]+" ");
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }

}
