package com.learn.jvm;

public class JvmXmxArgs {
	
	 private static int count = 0;
	    public static void recursion(){
	        count++;
	        recursion();
	    }

	    public static void recursion(long a,long b,long c){
	        long e=1,f=2,g=3,h=4,j=5,k=6,l=7,q=8,w=10,r=9;
	        count++;
	        recursion(a,b,c);
	    }
	
	public void localVarGC1(){
		byte[] bytes=new byte[1024*1024];
		System.gc();
	}
	
	public void localVarGC2(){
		byte[] bytes=new byte[1024*1024];
		bytes=null;
		System.gc();
	}
	
	public void localVarGC3(){
		{
			byte[] bytes=new byte[1024*1024];
		}
		System.gc();
	}
	
	public void localVarGC4(){
		{
			byte[] bytes=new byte[1024*1024];
		}
		int a=4;
		System.gc();
	}
	
	public void localVarGC5(){
		localVarGC1();
		System.gc();
	}

	public static void main(String[] args) {
		
		/*System.out.println(args.length);
		for (String arg : args) {
			System.out.println(args.length);
			System.out.println(arg+"hello");
			System.out.println("args is : "+arg);
		}
		System.out.println("-Xmx:"+Runtime.getRuntime().maxMemory()
				/1024/1024+"M");*/
		
		/*float a=-5;
		System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(a)));*/
		
		//JvmXmxArgs local=new JvmXmxArgs();
		System.out.println("-Xmx:"+Runtime.getRuntime().maxMemory()
				/1024/1024+"M");
		
		/**
		 * ÄÚ´æÒç³ö´íÎó,
		 * java.lang.OutOfMemoryError: Java heap space
		 */
		try {
			int[] array=new int[2000*1024*1024];
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		
		/**
		 * Õ»Òç³ö´íÎó,
		 * java.lang.StackOverflowError
		 */
		try {
			recursion();
		} catch (Throwable e) {
			System.out.println("counts = "+count);
			e.printStackTrace();
		}
		//local.localVarGC1();
		//local.localVarGC2();
		//local.localVarGC3();
		//local.localVarGC4();
		//local.localVarGC5();

	}

}
