package com.apex.demo;

public class BuyAndSellMulti {
	public static int maxProfitMulti(int[] prices) {
		int profit = 0;
		//int min = 0;

		for (int i = 0; i < prices.length-1; i++) {
			if (prices[i] > prices[i + 1])
				continue;
			else
				profit = profit + (prices[i + 1] - prices[i]);
		}
		return profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,2,6,7};
		int res=maxProfitMulti(arr);
		System.out.println(res);
	}

}
