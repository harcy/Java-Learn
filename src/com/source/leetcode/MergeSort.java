package com.source.leetcode;

public class MergeSort {
	
	public static void mergeSort(int[] num,int left,int right){
		if(left<right){
			int mid=(left+right)/2;
			mergeSort(num,left,mid);
			mergeSort(num, mid+1, right);
			//Merger(num,left,mid,mid+1,right);
			Merger(num,left,mid,right);
		}
	}
	
	public static void Merger(int[] num,int left,int center,int right){
		int[] temp=new int[num.length];
		int mid=center+1;
		int copyTime=left,var=left;
		while(left<=center && mid<=right){
			if(num[left]<=num[mid])
				temp[var++]=num[left++];
			else
				temp[var++]=num[mid++];
		}
		while(mid<=right)
			temp[var++]=num[mid++];
		while(left<=center)
			temp[var++]=num[left++];
		//BubbleSort.printArray(temp);
		//BubbleSort.printArray(num);
		while(copyTime<=right)
			num[copyTime]=temp[copyTime++];
		//BubbleSort.printArray(num);
	}
	
	/*public static void Merger(int[] num,int astart,int aend,int bstart,int bend ){
		int[] a=new int[aend-astart+1];
		int[] b=new int[bend-bstart+1];
		int alen=a.length;
		int blen=b.length;
		for(int i=0,j=astart;i<alen;i++,j++){
			a[i]=num[j];
		}
		for(int i=0,j=bstart;i<blen;i++,j++){
			b[i]=num[j];
		}
		int max=alen+blen;
		int c[]=new int[max];
		int[] c=new int[num.length];
		int alen=aend-astart+1;
		int blen=bend-bstart+1;
		int var=0;
		int i=0,j=0;
		while(i<alen && j<blen){
			if (num[i] <= num[j]) {
				c[var] = num[i];
				var++;
				i++;
			} else {
				c[var] = num[j];
				var++;
				j++;
			}
		}
		while(i<alen){
			c[var]=num[i];
			var++;
			i++;
		}
		while(j<blen){
			c[var]=num[j];
			var++;
			j++;
		}
		BubbleSort.printArray(c);
		int copyTime=astart;
		while(copyTime<c.length){
			num[copyTime]=c[copyTime];
			copyTime++;
		}
		BubbleSort.printArray(num);
		System.out.println();
	}*/

	public static void main(String[] args) {
		int[] array={1,5,2,4,7,3,9};
		BubbleSort.printArray(array);
		System.out.println();
		MergeSort.mergeSort(array, 0, array.length-1);
		BubbleSort.printArray(array);

	}

}
