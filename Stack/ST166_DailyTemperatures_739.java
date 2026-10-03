package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
Question:
Given an array of daily temperatures, return an array where answer[i] represents
how many days you have to wait after day i to get a warmer temperature.
If there is no future day with a warmer temperature, store 0.
Input:
        int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] temperatures2 = {30, 40, 50, 60};
        int[] temperatures3 = {30, 60, 90};
Example 1:
Output:
        [1, 1, 4, 2, 1, 1, 0, 0]
Explanation:
        For 73, the next warmer temperature is 74 after 1 day.
        For 75, the next warmer temperature is 76 after 4 days.
        76 has no warmer future temperature.
Example 2:
Output:
        [1, 1, 1, 0]
Explanation:
        Every temperature has a warmer temperature on the next day except 60.
Example 3:
Output:
        [1, 1, 0]
Explanation:
        30 waits 1 day for 60.
        60 waits 1 day for 90.
        90 has no warmer future temperature.
--------------------------------------------------
*/
public class ST166_DailyTemperatures_739 {
    public static int[] dailyTemperatures(int[] temp) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = n = temp.length;
        int ans[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && temp[i] >= temp[st.peek()]) st.pop();
            if (st.isEmpty()) {
                ans[i] = 0;

            } else {
                ans[i] = st.peek() - i;
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] temp1 = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(temp1)));

    }
}
