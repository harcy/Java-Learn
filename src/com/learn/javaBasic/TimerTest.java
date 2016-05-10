package com.learn.javaBasic;

import java.util.Timer;
import java.util.TimerTask;


public class TimerTest extends TimerTask {

	private final String jobName;
	public TimerTest(String jobName) {
		this.jobName=jobName;
	}
	
	@Override
	public void run() {
		System.out.println("run the task=>"+jobName);
	}

	public static void main(String[] args) {
		Timer timer=new Timer();
		timer.schedule(new TimerTest("Job 1"), 1000, 1000);
		timer.schedule(new TimerTest("Job 2"), 2000, 2000);
	}

}
