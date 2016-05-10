package com.patterns.abstractFactory;

public class IntelFactory implements CPUFactory {

	@Override
	public CPU produceCPU() {
		return new IntelCPU();
	}

}
