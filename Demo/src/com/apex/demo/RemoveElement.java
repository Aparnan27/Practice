package com.apex.demo;

public class RemoveElement {
	
	public static int removeElement(int[] nums, int val) {
		
		int i=0;
		int j=0;
		if(nums == null || nums.length == 0)
            return 0;
        
        for( i=0;i < nums.length;i++)
        {
           if(nums[i] == val) {
        	   j=i+1;
        	   while(nums[j]==nums[i]) {
        		   j++;
        	   }
        	   nums[i]=nums[j];
        	   break;
           }
        }
        return i+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,2,2,3,4};
		int target = 2;
		int res = removeElement(arr,target);
		System.out.println(res);
		
	}

}
