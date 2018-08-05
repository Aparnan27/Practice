package com.apex.demo;

public class SearchInsertPos {
	public static int searchInsert(int[] nums, int target) {
        int found =0;
        int rv=0;
        int last = nums.length-1;
        int k=0;
        
        for(int i=0;i<=nums.length-1;i++){
        	System.out.println("i= "+i);
        	System.out.println();
            if(nums[i] == target){
                rv = i;
                found = 1;
                break;
            }
        }
        
        if(found == 0)
        {
        	
        	System.out.println("sdgd");
            while(last > k && target < nums[last]){
            	System.out.println("here");
                rv = last-1;
                last = last-1;
            }
            if(target > nums[last]) {
            	System.out.println("hello");
                rv = last+1;
            }
        }
            
       return rv; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3};
		int tar=3;
		int res = searchInsert(arr,tar);
		System.out.println(res);
		
	}

}
