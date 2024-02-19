/*
You are given an array prices where prices is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

public class buyAndSellStocks {
    public static int calculateProfit(int stockPrice[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < stockPrice.length; i++) {
            if (buyPrice<stockPrice[i]){
                int profit = stockPrice[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else{
                buyPrice = stockPrice[i];
            }

        }
        return maxProfit;
    }

    /*
    corner case:
    buying me last day inexcessible kar do
    selling me first day inexcessible kar do
     */
    
    public static void main(String[] args) {
        int stockPrice[] = {7,6,4,3,1};
        System.out.println("The max profit possible is " + calculateProfit(stockPrice));
    }
    
}