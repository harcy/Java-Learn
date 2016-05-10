package com.learn.javaNIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo {
	public static void main(String[] args) throws IOException {
		String s="New String to write to file..."+System.currentTimeMillis();
		FileOutputStream fos=new FileOutputStream("C:\\Users\\lxchen\\Desktop\\hehe.txt");
		FileChannel channel=fos.getChannel();
		ByteBuffer buf=ByteBuffer.allocate(64);
		buf.clear();
		buf.put(s.getBytes());
		buf.flip();
		while(buf.hasRemaining()){
		    channel.write(buf);
		    //System.out.println(buf.get());
		}
		fos.close();
	}
}
