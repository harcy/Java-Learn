package com.learn.javaBasic;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerExecutorTest implements Runnable {
	
	private final String jobName;
	
	public SchedulerExecutorTest(String jobName) {
		this.jobName=jobName;
	}

	@Override
	public void run() {
		System.out.println("running => "+jobName);
	}
	
	public static void main(String[] args) {
		ScheduledExecutorService executor=Executors.newSingleThreadScheduledExecutor();
		executor.scheduleAtFixedRate(new SchedulerExecutorTest("job1"), 1, 1, TimeUnit.SECONDS);
		executor.scheduleWithFixedDelay(new SchedulerExecutorTest("job2"),1,2,TimeUnit.SECONDS);
	}

}
