package DSA.Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

/*
Question:
Given an integer N, generate the binary representations of all numbers
from 1 to N using a Queue.
Input:
        int n1 = 5;
        int n2 = 3;
        int n3 = 8;
Example 1:
Output:
        1 10 11 100 101
Explanation:
        The binary representations of numbers from 1 to 5 are generated
        in increasing order using a Queue.
Example 2:
Output:
        1 10 11
Explanation:
        The binary representations of 1, 2, and 3 are generated.
Example 3:
Output:
        1 10 11 100 101 110 111 1000
Explanation:
        The Queue is used to generate the next binary numbers systematically.
--------------------------------------------------
*/
public class Q182_GenerateBinaryNumbersFrom1ToN {
    public static ArrayList<String> generateBinary(int n) {
        ArrayList<String>list=new ArrayList<>();
        // code here
        if(n <= 0) return list;
        Queue<String> q = new ArrayDeque<>();
        q.offer("1");
        while(list.size() < n){
            String current = q.poll();
            list.add(current);
            if(list.size() < n) q.offer(current + "0");
            if(list.size() < n) q.offer(current + "1");
        }

        return list;
    }
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 3;
        int n3 = 8;
        System.out.println(generateBinary(n1));
        System.out.println(generateBinary(n2));
        System.out.println(generateBinary(n3));
    }
}
