package com.learn.javaIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @author lxchen
 *java�ļ�ģ�ͣ���Ӳ���ϵ��ļ��ǰ�byte byte byte�洢�ģ���byte���ݵļ���
 */


/**
 * RandomAccessFile�ṩ�˶��ļ����ݵķ���,�����Զ��ļ�Ҳ����д�ļ�
 * RandomAccessFile֧����������ļ������Է����ļ�������λ��
 * @author lxchen
 *
 */

/**
 * ���ļ������ַ�ʽ��rw--����д����r--��ֻ����,�ļ�ָ���ڴ��ļ�ʱ���ļ���ͷλ�ã���pointer=0
 * д�ļ���randomaccessfile.write(int)---->ֻдһ��byte(��8λ)
 * ���ļ���int b=randomaccessfile.read()---->��һ��byte
 * ��д�ļ�����֮��һ��Ҫ�ر�
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
		//���ļ�֮ǰ���뽫ָ���Ƶ��ļ���ͷ
		raf.seek(0);
		byte[] bytes=new byte[(int)raf.length()];
		raf.read(bytes); 
		System.out.println(Arrays.toString(bytes));
	}

}
