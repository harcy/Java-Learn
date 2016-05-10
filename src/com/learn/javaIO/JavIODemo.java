package com.learn.javaIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;


/**java IO��(�������������)
 * �ֽ������ַ���
 * 1.�ֽ���
 * 1)InputStream,OutputStream
 *   InputStream������Ӧ�ó����ȡ���ݵķ�ʽ
 *   OutputStream������Ӧ�ó���д�����ݵķ�ʽ
 *   ����д���ֵ��ļ��У�����--->������
 * 2)InputStream��������������
 *   int b=in.read()��ȡһ���ֽ��޷�����䵽int�ĵͰ�λ
 *   in.read(byte[] buf)
 * 3)OutputStream�������������
 *   out.write(int b)д��һ��byte������b�ĵ�8λ
 *   out.write(byte[] buf)��buf�ֽ�����д�뵽��
 * 4)DataInputStream & DataOutputStream ��"��"���ܵ���չ�����Ը��ӷ����
 *   ��ȡint,long,�ַ�����������,e.g writeInt()/writeDouble()
 * 2.�ַ���
 * 1)�ı����ı��ļ�����ʶ
 *   java�ı�����ʵ����char,��16λ���޷�������,���ַ���unicode����(˫�ֽڱ���)
 *   �ļ����ᵽ��,����byte byte ...���ֽ�����
 *   �ı��ļ������ı�(char)���а���ĳ�ֱ��뷽��(utf-8,utf-16be,gbk)���л�Ϊbyte�Ĵ洢���
 * 2)�ַ�����--->��Ҫ���������ı��ļ�
 *   Reader,Writer.�ַ��Ĵ���һ�δ���һ���ַ�(���ַ��ĵײ���Ȼ�ǻ������ֽ�����)
 *   �ַ����Ļ���ʵ�֣�
 *   InputStreamReader--->���byte������Ϊchar�������ձ������
 *   OutputStreamWriter--->�ṩchar����byte�������ձ��봦��
 * 3)FileReader,FileWriter--->��Ҫ�ǲ����ļ��ģ��������InputStreamReader,
 *   OutputStreamWriter�����ƣ������Ǳ�ǰ�߼�
 * 4)�ַ����Ĺ�����:
 *   BufferedReader--->readLine һ�ζ�һ��
 *   BufferedWriter/PrintWriter--->дһ��
 * @author lxchen
 *
 */
public class JavIODemo {
	
	public static void brAndbw() throws IOException{
		BufferedReader br=new BufferedReader(
				new InputStreamReader(
						new FileInputStream("D:\\IO\\immoc2.txt")));
		PrintWriter pw=new PrintWriter(new FileOutputStream("D:\\IO\\immoc4.txt"), true);
		String line;
		while((line=br.readLine())!=null){
			pw.println(line);
		}
		br.close();
		pw.close();
		/*BufferedWriter bw=new BufferedWriter(
				new OutputStreamWriter(
						new FileOutputStream("D:\\IO\\immoc3.txt")));
		String line;
		while((line=br.readLine())!=null){
			System.out.println(line);//ʹ��printlnʵ�ֵĻ��У�readLine�����޷���ȡ���з�
			bw.write(line);
			bw.newLine();//д���ʱ����Ҫ����д�뻻�з�
			bw.flush();
		}
		br.close();
		bw.close();*/
	}
	
	public static void frAndfw() throws IOException{
		FileReader fr=new FileReader("D:\\IO\\immoc.txt");
		FileWriter fw=new FileWriter("D:\\IO\\immoc2.txt",true);
		char[] buffer=new char[8*1024];
		int c;
		while((c=fr.read(buffer,0,buffer.length))!=-1){
			fw.write(buffer, 0, c);
			fw.flush();//remember
		}
		fr.close();
		fw.close();
	}
	
	public static void isrAndosr() throws IOException{
		FileInputStream in=new FileInputStream("D:\\IO\\Untitled 2");
		InputStreamReader isr=new InputStreamReader(in,"utf-8");//Ĭ����Ŀ�ı���
		/*int c;
		while((c=isr.read())!=-1){
			System.out.print((char)c);
		}*/
		char[] buffer=new char[8*1024];
		int c;
		while((c=isr.read(buffer, 0, buffer.length))!=-1){
			String s=new String(buffer, 0, c);
			System.out.print(s);
		}
		isr.close();
	}
	
	public static void printHex(String fileName) throws IOException{
		FileInputStream in=new FileInputStream(fileName);
		//int b;
		//int i=1;
		/*while((b=in.read())!=-1){
			System.out.print(Integer.toHexString(b)+" ");
			if(i++%10==0)
				System.out.println();
		}*/
		File file=new File(fileName);
		int len=(int)file.length();
		byte[] b=new byte[len];
		in.read(b);
		System.out.println();
		in.close();
	}
	
	public static void writeFile(String fileName) throws IOException{
		FileOutputStream out=new FileOutputStream(fileName);
		out.write('A');
		out.write('B');
		byte[] bytes="�Ϻ�".getBytes("gbk");
		out.write(bytes);
		out.close();
	}
	
	public static void copyFile(File srcFile,File destFile) throws IOException{
		FileInputStream in=new FileInputStream(srcFile);
		FileOutputStream out=new FileOutputStream(destFile);
		byte[] bytes=new byte[8*1024];
		int b;
		while((b=in.read(bytes, 0, bytes.length))!=-1){
			out.write(bytes, 0, b);
			out.flush();
		}
		in.close();
		out.close();
	}
	
	public static void main(String[] args) throws IOException {
		//JavIODemo.isrAndosr();
		//JavIODemo.frAndfw();
		JavIODemo.brAndbw();
		//String s="D:\\IO\\iotest.txt";
//		JavIODemo.printHex(s);
//		JavIODemo.writeFile(s);
//		File src=new File(s);
//		File dest=new File("D:\\IO\\iotestcopy.txt");
		/*DataOutputStream dos=new DataOutputStream(new FileOutputStream(s));
		dos.writeUTF("�Ϻ�");
		dos.writeInt(10);
		dos.writeUTF("�й�");
		dos.close();
		OutputStream os=new FileOutputStream(s);
		BufferedOutputStream bos=new BufferedOutputStream(os);
		byte[] b="����".getBytes();
		bos.write(b);
		bos.flush();
		bos.close();*/
		/*InputStream is=new FileInputStream(s);
		BufferedInputStream bis=new BufferedInputStream(is);
		byte[] bs=new byte[8*1024];
		int i;
		while((i=bis.read(bs, 0, bs.length))!=-1){
			//System.out.println();
		}*/
		
		//System.out.println(bs);
		//dos.writeUTF("�Ϻ�");
		//dos.writeChars("�й�");
		//JavIODemo.copyFile(src, dest);
	}

}
