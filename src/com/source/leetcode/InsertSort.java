package com.source.leetcode;

public class InsertSort {
	
	public static void insertSort(int[] num){
		int len=num.length;
		/*for(int i=1;i<len;i++){
			if(num[i]>=num[i-1])
				continue;
			else{
				for(int j=i;j>0;j--){
					if(num[j]<num[j-1]){
						int tem=num[j-1];
						num[j-1]=num[j];
						num[j]=tem;
					}
					
				}
			}
		}*/
		for(int i=1;i<len;i++){
			if(num[i]<num[i-1]){
				for(int j=i;j>0;j--){
					if(num[j]<num[j-1]){
						int tem=num[j-1];
						num[j-1]=num[j];
						num[j]=tem;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array={1,5,2,4,7,3,9};
		BubbleSort.printArray(array);
		System.out.println();
		InsertSort.insertSort(array);
		BubbleSort.printArray(array);

	}

}
