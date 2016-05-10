package com.learn.test;

public class ServiceInterfaceImp implements ServiceInterface {

	DaoInterface dao;
	
	
	public void setDao(DaoInterface dao) {
		this.dao = dao;
	}


	@Override
	public void save(String arg) {
		
		System.out.println("jie shou can shu"+arg);
		arg=arg+":"+this.hashCode();
		System.out.println(arg);
		DaoInterface dao=new DaoInterfaceImp();
		Object o=new Object();
		
		dao.saveData(arg);
	}

}
