package com.learn.javaIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @author lxchen
 *java文件模型：在硬盘上的文件是按byte byte byte存储的，是byte数据的集合
 */


/**
 * RandomAccessFile提供了对文件内容的访问,即可以读文件也可以写文件
 * RandomAccessFile支持随机访问文件，可以访问文件的任意位置
 * @author lxchen
 *
 */

/**
 * 打开文件有两种方式：rw--“读写”和r--“只读”,文件指针在打开文件时在文件开头位置，即pointer=0
 * 写文件：randomaccessfile.write(int)---->只写一个byte(低8位)
 * 读文件：int b=randomaccessfile.read()---->读一个byte
 * 读写文件结束之后一定要关闭
 * @author lxchen
 *
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf=new RandomAccessFile("D:\\IO\\iotest.txt", "rw");
		System.out.println(raf.getFilePointer());
		raf.write('A');
		System.out.println(raf.getFilePointer());
		//System.out.println(raf.read());
		int i=0x7fffffff;
		//raf.write(i);
		raf.writeInt(i);
		System.out.println(raf.getFilePointer());
		System.out.println(raf.length());
		//读文件之前必须将指针移到文件开头
		raf.seek(0);
		byte[] bytes=new byte[(int)raf.length()];
		raf.read(bytes); 
		System.out.println(Arrays.toString(bytes));
	}

}
