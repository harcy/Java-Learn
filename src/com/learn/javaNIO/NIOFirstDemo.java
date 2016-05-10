package com.learn.javaNIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;
import java.util.Set;
import java.nio.ByteBuffer;

public class NIOFirstDemo {
	
	public static void main(String[] args) throws IOException {
		/*RandomAccessFile raf=new RandomAccessFile("C:\\Users\\lxchen\\Desktop\\New Text Document.txt", "rw");
		FileChannel fc=raf.getChannel();
		ByteBuffer buf=ByteBuffer.allocate(400);
		int n=fc.read(buf);
		while(n!=-1){
			System.out.print("Read"+n);
			buf.flip();
			while(buf.hasRemaining())
				System.out.print((char)buf.get());
			buf.clear();
			n=fc.read(buf);
		}
		raf.close();*/
		/*RandomAccessFile raf=new RandomAccessFile("C:\\Users\\lxchen\\Desktop\\cfgEnb.txt", "rw");
		FileChannel fc=raf.getChannel();
		ByteBuffer buf=ByteBuffer.allocate(1024);
		int n;
		while((n=fc.read(buf))!=-1){
			System.out.println("ChannelCodeByLiang"+n);
			buf.flip();
			while(buf.hasRemaining())
				System.out.print((char)buf.get());
			buf.clear();
		}
		raf.close();*/
		/*RandomAccessFile raf=new RandomAccessFile("C:\\Users\\lxchen\\Desktop\\test.txt", "rw");
		FileChannel fc=raf.getChannel();
		ByteBuffer buf=ByteBuffer.allocate(520);
		int n;
		n = fc.read(buf);
		buf.flip();
		if(buf.hasRemaining())
			System.out.println((char)buf.get());
		buf.mark();
		if(buf.hasRemaining())
			System.out.println((char)buf.get());
		buf.reset();
		if(buf.hasRemaining())
			System.out.println((char)buf.get());
		raf.close();*/
		Selector selector=Selector.open();
		ServerSocketChannel sschannel=ServerSocketChannel.open();
		sschannel.configureBlocking(false);
		/*��ͨ��ע�ᵽһ��selector�У��ڶ���������ֵΪinterest set���ֵ���ж���д��connect��accept��
	           ������ͨ��|�����������������Ȥ�ķ�����ʱ��  e.g.
		SelectionKey.OP_ACCEPT, SelectionKey.OP_CONNECT, SelectionKey.OP_READ, SelectionKey.OP_WRITE;
		int interestSet=SelectionKey.OP_READ|SelectionKey.OP_WRITE;
		channel.register(selector, interestSet);
		*/
		SelectionKey key=sschannel.register(selector, SelectionKey.OP_READ);
		//select()���������Ѿ�������channel�ĸ�����
		int readyChannels=selector.select();
		if(readyChannels==0)
			selector.wakeup();
		//selector.selectedKeys()����һ������set������"��ѡ�����(selected key set)"�е��Ѿ�������channel
		Set<SelectionKey> selectedKeys=selector.selectedKeys();
		//ͨ��Iterator���������е����о���channel���ж��������־������ͣ�isConnectable,isAcceptable,isReadable,isWritable
		Iterator<SelectionKey> iteKeys = selectedKeys.iterator() ;
		while(iteKeys.hasNext()){
			SelectionKey selectionKeyItem=iteKeys.next();
			if(selectionKeyItem.isConnectable()){
				
			}
			else if(selectionKeyItem.isAcceptable()){
				
			}
			else if(selectionKeyItem.isReadable()){
				
			}
			else if(selectionKeyItem.isWritable()){
				
			}
			//ע��remove��䣬Selector�����Լ�����ѡ��������Ƴ�SelectionKeyʵ���������ڴ�����ͨ��ʱ�Լ��Ƴ���
			//��ͨ��(channel)�´ξ���ʱ��Selector���ٴν��������ѡ������С�
			iteKeys.remove();
		}
	}
	

}
