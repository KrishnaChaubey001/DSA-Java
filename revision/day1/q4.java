package revision.day1;
/*
Question:
You are given a string s and an integer k.
You can choose any character of the string and change it to any other
uppercase English character.

You can perform this operation at most k times.

Return the length of the longest substring containing the same letter
you can get after performing the above operations.

Example 1:
Input:
String s = "ABAB";
int k = 2;

Output:
4

Example 2:
Input:
String s = "AABABBA";
int k = 1;

Output:
4

Example 3:
Input:
String s = "AAAA";
int k = 2;

Output:
4
*/
public class q4 {
    public static int longestRepeating(String s,int k){
        int freq[]=new int [26];
        int maxfreq=0,maxlen=0,i=0,j=0;
        while(j< s.length()){
            maxfreq=Math.max(maxfreq,++freq[s.charAt(j)-'A']);
            while((j-i+1-maxfreq)>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "AAAA";
        int k = 2;
        System.out.println(longestRepeating(s,k));
        String s1 = "AABABBA";
        int k1 = 1;
        System.out.println(longestRepeating(s1,k1));

    }
}
