package com.thread.threadlocal;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class UnsafeTask implements Runnable {
	
	private Date startDate;
	@Override
	public void run() {
		startDate=new Date();
		System.out.printf("Starting Thread:%s: %s\n",Thread.currentThread().getId(),startDate);
		try {
			TimeUnit.SECONDS.sleep((int)Math.rint(Math.random()));
		}
	}

}
