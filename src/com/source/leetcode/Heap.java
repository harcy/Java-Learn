package com.source.leetcode;

public class Heap {
	
	public void MinHeapUp(int a[],int i){
		int temp=a[i];
		int parent=(i-1)/2;
		while(parent>=0 && i!=0){
			if(a[parent]<=temp)
				break;
			a[i]=a[parent];
			i=parent;
			parent=(i-1)/2;
		}
		a[i]=temp;
	}
	
	
	public void MinHeadInsert(int a[],int index,int data){
		a[index]=data;
		MinHeapUp(a,index);
	}
	
	public void MinHeapDown(int a[],int i,int n){
		int temp=a[i];
		int j=2*i+1;
		while(j<n){
			if(j+1<n && a[j]>a[j+1])
				j++;
			if(a[j]>=temp)
				break;
			a[i]=a[j];
			i=j;
			j=2*i+1;
		}
		a[i]=temp;
	}
	
	public void MinHeapDelete(int a[],int n){
		int temp=a[0];
		a[0]=a[n-1];
		a[n-1]=temp;
		MinHeapDown(a, 0, n-1);
	}
	
	public void MakeMinHeap(int a[],int n){
		int index=(n-2)/2;
		for(;index>=0;index--){
			MinHeapDown(a, index, n);
		}
	}
	

}
