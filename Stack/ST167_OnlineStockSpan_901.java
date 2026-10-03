package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Question:
Design a StockSpanner class that calculates the stock span for each day's price.

The span of today's price is the number of consecutive days before today,
including today, for which the stock price was less than or equal to today's price.
Input:
        prices = {100, 80, 60, 70, 60, 75, 85}
Example 1:
Output:
        [1, 1, 1, 2, 1, 4, 6]
Explanation:
        For price 70, the span is 2 because 60 and 70 are consecutive
        prices less than or equal to 70.
        For price 75, the span is 4.
        For price 85, the span is 6.
Example 2:
Input:
        prices = {10, 20, 30, 40}
Output:
        [1, 2, 3, 4]
Explanation:
        Every new price is greater than all previous prices, so the span
        increases by one each day.
Example 3:
Input:
        prices = {50, 40, 30, 20}
Output:
        [1, 1, 1, 1]
Explanation:
        Every new price is smaller than the previous price, so each span is 1.
--------------------------------------------------
*/
public class ST167_OnlineStockSpan_901 {
    Deque<int[]> st;
    ST167_OnlineStockSpan_901(){
        st=new ArrayDeque<>();
    }
    public int next(int price){
        int span=1;
        while(!st.isEmpty() && price>=st.peek()[0]){
            span+=st.pop()[1];
        }
        st.push(new int[]{price,span});
        return span;
    }


}
