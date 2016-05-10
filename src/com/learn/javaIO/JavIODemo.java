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


/**java IO流(输入流、输出流)
 * 字节流和字符流
 * 1.字节流
 * 1)InputStream,OutputStream
 *   InputStream抽象了应用程序读取数据的方式
 *   OutputStream抽象了应用程序写出数据的方式
 *   键盘写文字到文件中：键盘--->输入流
 * 2)InputStream输入流基本方法
 *   int b=in.read()读取一个字节无符号填充到int的低八位
 *   in.read(byte[] buf)
 * 3)OutputStream输出流基本方法
 *   out.write(int b)写入一个byte到流，b的低8位
 *   out.write(byte[] buf)将buf字节数组写入到流
 * 4)DataInputStream & DataOutputStream 对"流"功能的扩展，可以更加方便的
 *   读取int,long,字符等类型数据,e.g writeInt()/writeDouble()
 * 2.字符流
 * 1)文本、文本文件的认识
 *   java文本：其实就是char,是16位的无符号整数,是字符的unicode编码(双字节编码)
 *   文件已提到过,就是byte byte ...的字节序列
 *   文本文件：是文本(char)序列按照某种编码方案(utf-8,utf-16be,gbk)序列化为byte的存储结果
 * 2)字符流：--->主要操作的是文本文件
 *   Reader,Writer.字符的处理，一次处理一个字符(但字符的底层任然是基本的字节序列)
 *   字符流的基本实现：
 *   InputStreamReader--->完成byte流解析为char流，按照编码解析
 *   OutputStreamWriter--->提供char流到byte流，按照编码处理
 * 3)FileReader,FileWriter--->主要是操作文件的，跟上面的InputStreamReader,
 *   OutputStreamWriter很类似，构造是比前者简单
 * 4)字符流的过滤器:
 *   BufferedReader--->readLine 一次读一行
 *   BufferedWriter/PrintWriter--->写一行
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
			System.out.println(line);//使用println实现的换行，readLine本身无法读取换行符
			bw.write(line);
			bw.newLine();//写入的时候需要自行写入换行符
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
		InputStreamReader isr=new InputStreamReader(in,"utf-8");//默认项目的编码
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
		byte[] bytes="上海".getBytes("gbk");
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
		dos.writeUTF("上海");
		dos.writeInt(10);
		dos.writeUTF("中国");
		dos.close();
		OutputStream os=new FileOutputStream(s);
		BufferedOutputStream bos=new BufferedOutputStream(os);
		byte[] b="美国".getBytes();
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
		//dos.writeUTF("上海");
		//dos.writeChars("中国");
		//JavIODemo.copyFile(src, dest);
	}

}
