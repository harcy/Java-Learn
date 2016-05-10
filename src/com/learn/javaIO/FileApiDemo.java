package com.learn.javaIO;

import java.io.File;

public class FileApiDemo {

	
	
/*	public static void printDirectoryList(String fileName){
		File file=new File(fileName);
		if(file.isDirectory()){
			String[] sonName=file.list();
			for(String s:sonName){
				System.out.println(s);
				File sonFile=new File(s);
				System.out.println(sonFile.getPath());
				//System.out.println(sonFile.exists());
				if(sonFile.isDirectory()){
					printDirectoryList(s);
				}
			}
		}
		else{
			System.out.println(file.getName());
			return;
		}
			
	}*/
	
	public static void printDirectoryList(File dir){
		if(dir.isDirectory()){
			String[] sonName=dir.list();
			File[] file=dir.listFiles();
			/*for(String s:sonName){
				//System.out.println(s);
				System.out.println(dir.getName()+"\\"+s);
			}*/
			for(File f:file){
				//System.out.println(f);
				if(f!=null && f.length()>0){
					if(f.isDirectory())
						printDirectoryList(f);
					else
						System.out.println(f);
						
				}
			}
		}
	}
	
	/**
	 * File类只用来查看文件(目录)的信息，比如文件的类型，名称和大小等
	 * 并不能对文件进行访问
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*File file=new File("D:\\IO");
		if(file.exists()){
			System.out.println(file.isDirectory());
			System.out.println(file.getName());
		}
		else{
			file.mkdir();
			//System.out.println(file.getName());
		}*/
		//String s=new String("C:\\Program Files");
		File file=new File("C:\\Program Files");
		FileApiDemo.printDirectoryList(file);
		/*while(file.isDirectory()){
			System.out.println(file.getName());
		}*/
	}

}
