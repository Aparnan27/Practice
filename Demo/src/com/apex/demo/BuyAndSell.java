package com.apex.demo;

public class BuyAndSell {
	
	 
	/* int profit = 0;
	    int min=0;

	    for (int i = 0; i < prices.length; i++) {
            int profit=Math.max(profit,prices[i]-min);
            min = Math.min(prices[i],min);
		}
	    return profit;*/
	

	
	 public static int maxProfit(int[] prices) {

		int profit = 0;
		int maxProfit = 0;

		for (int i = 0; i < prices.length; i++) {

			for (int j = i + 1; j < prices.length; j++) {

				if (j > i) {

					profit = prices[j] - prices[i];
				}
				if (profit > maxProfit) {
					maxProfit = profit;
				}
			}
		}
		return maxProfit;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,1};
		int res=maxProfit(arr);
		System.out.println(res);
	}

}
