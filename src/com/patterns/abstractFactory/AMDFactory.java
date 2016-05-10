package com.patterns.abstractFactory;

public class AMDFactory implements CPUFactory {

	@Override
	public CPU produceCPU() {
		return new AMDCPU();
	}

}
