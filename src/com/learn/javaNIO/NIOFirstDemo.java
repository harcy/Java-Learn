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
		/*将通道注册到一个selector中，第二个参数的值为interest set里的值，有读、写、connect、accept等
	           还可以通过|操作符监听多个感兴趣的发生的时间  e.g.
		SelectionKey.OP_ACCEPT, SelectionKey.OP_CONNECT, SelectionKey.OP_READ, SelectionKey.OP_WRITE;
		int interestSet=SelectionKey.OP_READ|SelectionKey.OP_WRITE;
		channel.register(selector, interestSet);
		*/
		SelectionKey key=sschannel.register(selector, SelectionKey.OP_READ);
		//select()函数返回已经就绪的channel的个数，
		int readyChannels=selector.select();
		if(readyChannels==0)
			selector.wakeup();
		//selector.selectedKeys()返回一个集合set，代表"已选择键集(selected key set)"中的已经就绪的channel
		Set<SelectionKey> selectedKeys=selector.selectedKeys();
		//通过Iterator遍历集合中的所有就绪channel，判断属于那种就绪类型，isConnectable,isAcceptable,isReadable,isWritable
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
			//注意remove语句，Selector不会自己从已选择键集张移除SelectionKey实例。必须在处理完通道时自己移除，
			//该通道(channel)下次就绪时，Selector会再次将其放入已选择键集中。
			iteKeys.remove();
		}
	}
	

}
