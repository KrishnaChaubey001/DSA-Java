package DSA.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

/*
Question:
Given a stream of lowercase characters, after reading each character,
find the first character that has appeared only once so far.
If no non-repeating character exists, output '#'.
Input:
        String str1 = "aabc";
        String str2 = "aabb";
        String str3 = "abcabc";
Example 1:
Output:
        a#bb
Explanation:
        After reading:
        a → a
        a → #
        b → b
        c → b
        Therefore, the result is a#bb.
Example 2:
Output:
        a#bb
Explanation:
        After the first two characters, a becomes repeating.
        After b appears twice, there is no non-repeating character.
Example 3:
Output:
        aabbcc
Explanation:
        At each step, the first character that has appeared only once
        is maintained using a Queue.
--------------------------------------------------
*/
public class Q183_FirstNonRepeatingCharacterInStream {
    public static String firstNonRepeatingCharacterInStream(String s){
        Queue<Character>q=new ArrayDeque<>();
        StringBuilder sb=new StringBuilder();
        int freq[]=new int[26];
        for(char ch:s.toCharArray()){
            q.offer(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.poll();
            }
            if(q.isEmpty()){
                sb.append('#');

            }else{
                sb.append(q.peek());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String str1 = "aabc";
        String str2 = "aabb";
        String str3 = "abcabc";
        System.out.println(firstNonRepeatingCharacterInStream(str1));
        System.out.println(firstNonRepeatingCharacterInStream(str2));
        System.out.println(firstNonRepeatingCharacterInStream(str3));
    }

}
