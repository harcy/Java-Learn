package com.learn.javaNIO;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;



public class EchoServer implements Runnable{
	private ServerSocketChannel servChannel;
	private Selector selector;
	private InetSocketAddress socket;
	private InetAddress address;
	private byte[] bytes={127,0,0,1};
	//private ByteBuffer buf=ByteBuffer.allocate(1024);
	
	public EchoServer(){
		try {
			this.servChannel=ServerSocketChannel.open();
			this.selector=Selector.open();
			this.address=InetAddress.getByAddress(bytes);
			this.socket=new InetSocketAddress(address, 8000);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			/*int interestops=SelectionKey.OP_ACCEPT|SelectionKey.OP_CONNECT|
					SelectionKey.OP_READ|SelectionKey.OP_WRITE;
			servChannel.configureBlocking(false);*/
			servChannel.bind(socket);
			servChannel.register(selector, SelectionKey.OP_ACCEPT);
			//servChannel.register(selector, interestops);
			while(true){
				int readyNum=selector.select();
				if(readyNum < 1)
					continue;
				Set<SelectionKey> keys=selector.selectedKeys();
				Iterator<SelectionKey> iteKey=keys.iterator();
				while(iteKey.hasNext()){
					SelectionKey keyState=iteKey.next();
					System.out.println(keyState.channel());
					System.out.println(keyState.selector());
					iteKey.remove();
					if(keyState.isAcceptable()){
						ServerSocketChannel ssc=(ServerSocketChannel)keyState.channel();
						SocketChannel conn=ssc.accept();
						conn.configureBlocking(false);
						conn.register(selector, SelectionKey.OP_READ);
					}
					else if(keyState.isConnectable())
						continue;
					else if(keyState.isReadable()){
						readKey(keyState);
					}
					else if(keyState.isWritable()){
						writeKey(keyState);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void readKey(SelectionKey key){
		SocketChannel socketChan=(SocketChannel)key.channel();
		ByteBuffer buf=ByteBuffer.allocate(1024);
		try {
			while((socketChan.read(buf))!=-1){
				buf.flip();
				while(buf.hasRemaining()){
					System.out.println((char)buf.get());
				}
				buf.clear();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void writeKey(SelectionKey key){
		
	}
	
	public static void main(String[] args) {
		EchoServer server=new EchoServer();
		new Thread(server).start();
	}

}
