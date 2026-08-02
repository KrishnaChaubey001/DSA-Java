package DSA.revision.day3;
/*
Question:
You are given an array prices where prices[i] is the price of a given stock
on the ith day.

You want to maximize your profit by choosing a single day to buy one stock
and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve.
If no profit is possible, return 0.

Example 1:
Input:
int[] prices = {7,1,5,3,6,4};

Output:
5

Explanation:
Buy on day 2 (price = 1)
Sell on day 5 (price = 6)
Profit = 6 - 1 = 5

Example 2:
Input:
int[] prices = {7,6,4,3,1};

Output:
0

Explanation:
No profit can be made.
--------------------------------------------------
*/

public class Q1_BestTimeToBuyAndSellStock_121 {
    public static int maxProfit(int[] prices) {
        int minPrice=prices[0],max=0;
        for(int i=1;i<prices.length;i++){
            minPrice=Math.min(minPrice,prices[i]);
            int profit=prices[i]-minPrice;
            max=Math.max(max,profit);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
