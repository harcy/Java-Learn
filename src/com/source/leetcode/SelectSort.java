package com.source.leetcode;

public class SelectSort {

	/*public static void selectSort(int[] num){
		int len=num.length;
		for(int i=0;i<len;i++){
			int tmp=num[i];
			int position=i;
			for(int j=i;j<len;j++){
				if(num[j]<tmp){
					tmp=num[j];
					position=j;
				}
			}
			int s=num[i];
			num[i]=num[position];
			num[position]=s;
		}
	}*/
	
	public static void selectSortAdvance(int[] num){
		int len=num.length;
		for(int i=0;i<len;i++){
			int min=i;
			for(int j=i+1;j<len;j++){
				if(num[j]<num[min]){
					min=j;
				}
			}
			int tmp=num[i];
			num[i]=num[min];
			num[min]=tmp;
		}
	}
	
	public static void main(String[] args) {
		int[] array={1,5,2,4,7,3,9};
		//int[] array={9,8,7,7,6,5,4,3,2,1,0};
		BubbleSort.printArray(array);
		System.out.println();
		//SelectSort.selectSort(array);
		SelectSort.selectSortAdvance(array);
		BubbleSort.printArray(array);

	}

}
