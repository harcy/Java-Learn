package com.source.leetcode;


public class BubbleSort {
	
	public static void swap(Integer i,Integer j){
		Integer tem;
		tem=i;
		i=j;
		j=tem;
	}
	
	public static void bubbleSort(int[] num){
		int len=num.length;
		for(int i=0;i<len;i++){
			for(int j=1;j<len-i;j++){
				if(num[j]<num[j-1]){
					//BubbleSort.swap(num[j],num[j-1]);
					int tem=num[j];
					num[j]=num[j-1];
					num[j-1]=tem;					
				}
			}
		}
	}
	
	public static void printArray(int[] num){
		int len=num.length;
		for(int i=0;i<len;i++)
			System.out.print(num[i]+" ");
	}

	public static void main(String[] args) {
		int[] array={1,5,2,4,7,3,9};
		BubbleSort.printArray(array);
	    System.out.println();
		BubbleSort.bubbleSort(array);
		BubbleSort.printArray(array);
	}

}
