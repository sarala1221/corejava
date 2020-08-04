package com.structural.bridge;

public class AdvancedRemote extends BasicRemote {

	public AdvancedRemote(Device device) {
		super.device = device;		
	}

	public int mute() {
		return 0;
	}

}
