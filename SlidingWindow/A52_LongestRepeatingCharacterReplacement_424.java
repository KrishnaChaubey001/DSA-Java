package DSA.SlidingWindow;
/*
Question:
Given a string s and an integer k, you can choose any character and change it to any other uppercase English character at most k times.
Return the length of the longest substring containing the same letter after performing at most k replacements.
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
Explanation:
"AABA" or "ABBA"
 */
public class A52_LongestRepeatingCharacterReplacement_424 {
    public static int bruteForcecharacterReplacement(String s, int k) {
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            int freq[]=new int[26];
            int maxfreq=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                freq[ch-'A']++;
                maxfreq=Math.max(maxfreq,freq[ch-'A']);
                if(j-i+1-maxfreq<=k){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
        return maxlen;
    }
    public static int optimalSolutioncharacterReplacement(String s, int k) {
        int freq[]=new int [26];
        int i=0,j=0,maxlen=0,maxfreq=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            freq[ch-'A']++;
            maxfreq=Math.max(maxfreq,freq[ch-'A']);
            while(j-i+1-maxfreq>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(bruteForcecharacterReplacement(s,k));
        System.out.println(optimalSolutioncharacterReplacement(s,k));
        String s1 = "AABABBA";
        int k1 = 1;
        System.out.println(bruteForcecharacterReplacement(s1,k1));
        System.out.println(optimalSolutioncharacterReplacement(s1,k1));


    }
}
