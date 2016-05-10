package com.learn.javaNIO;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class SocketChanelDemo {
	
	public static void main(String[] args) throws IOException {
		SocketChannel channel=SocketChannel.open();
		//String address="127.0.0.1";		
		byte[] addbytes={127,0,0,1};
		//byte[] bytes=address.getBytes();
		InetAddress addr=InetAddress.getByAddress(addbytes);
		SocketAddress socket=new InetSocketAddress(addr, 8080);
		channel.configureBlocking(false);
		channel.connect(socket);
		ByteBuffer buf=ByteBuffer.allocate(512);
		channel.read(buf);
		while(!channel.finishConnect()){
			//wait or do something else, read & write 
			//will return even no data for read & write
		}
		//channel.connect()
		
		ServerSocketChannel serverchannel=ServerSocketChannel.open();
		SocketAddress serversocket=new InetSocketAddress(8080);
		serverchannel.bind(serversocket);
		while(true){
			SocketChannel connectionChannel= serverchannel.accept();
			if(connectionChannel != null){
				//do something with socketChannel, e.g. read & write
			}
		}
	}
		
}
	
