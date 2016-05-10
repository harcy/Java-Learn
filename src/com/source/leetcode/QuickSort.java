package com.source.leetcode;

public class QuickSort {
	
	public static void quickSort(int[] num,int left,int right){
		if(left<right){
			int position=pivort(num,left,right);
			quickSort(num, left, position-1);
			quickSort(num, position+1, right);
		}
	}
	
	public static int pivort(int[] num,int left,int right){
		int i=left,j=right;
		int x=num[i];
		while(i<j){
			while(num[j]>=x && i<j)
				j--;
			if(i<j)
				num[i]=num[j];
			while(num[i]<=x && i<j)
				i++;
			if(i<j)
				num[j]=num[i];
		}
		num[i]=x;
		return i;
	}

	public static void main(String[] args) {
		int[] array={1,5,2,4,7,3,9};
		BubbleSort.printArray(array);
	    System.out.println();
		QuickSort.quickSort(array, 0, array.length-1);
		BubbleSort.printArray(array);

	}

}
