package com.patterns.abstractFactory;

public class Computer {
	
	private CPU cpu;
	public Computer(CPUFactory factory){
		cpu=factory.produceCPU();
		cpu.process();
	}

}
