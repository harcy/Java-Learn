package com.learn.test;

public class DaoInterfaceImp extends ClassLoader implements DaoInterface {

	@Override
	public void saveData(String arg) {
		// TODO Auto-generated method stub
		System.out.println("bao cun"+arg);
	}
	
	public static void main(String[] args) {
		DaoInterfaceImp dao=new DaoInterfaceImp();
		try {
			dao.loadClass("DaoInterfaceImp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
