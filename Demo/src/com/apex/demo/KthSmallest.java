package com.apex.demo;

public class KthSmallest {
	
	static void findElementMergeSort(int a[],int target)
	{
		int left[],right[],sorted_arr[];
		int length = a.length;
		int mid = length/2;
		left = new int[mid];
		right = new int[length-mid];
		if(length < 2)
			return;
		for(int i=0;i<mid;i++)
		{
			left[i] = a[i];
		}
		
		for(int i=mid;i< length;i++)
		{
			right[i-mid]=a[i];
		}
		findElementMergeSort(left,target);
		findElementMergeSort(right,target);
		merge(left,right,a,target);
		
		
	}
	
	static void merge(int l_arr[],int r_arr[],int sort_arr[], int tar)
	{
		int i=0,j=0,k=0;
		while(i<l_arr.length && j<r_arr.length) {
			if(l_arr[i] <= r_arr[j])
			{
				sort_arr[k]=l_arr[i];
				k++;
				i++;
			}
			else
			{
				sort_arr[k] = r_arr[j];
				k++;
				j++;
			}
		}
		while(i<l_arr.length) {
			sort_arr[k]=l_arr[i];
			k++;
			i++;
		}
		while(j < r_arr.length) {
			sort_arr[k] = r_arr[j];
			k++;
			j++;
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,13,15,45,60,44,82,77};
		int target=3;
		findElementMergeSort(arr,target);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println("");
		System.out.println(target+"kth smallest is:");
		System.out.println(arr[target-1]);

	}

}
