package com.structural.bridge;

public class TV implements Device {
	private boolean on = false;
	private int volume = 100;
	private int channel = 1;

	@Override
	public boolean isEnabled() {
		return on;
	}

	@Override
	public void enable() {
		this.on = true;
	}

	@Override
	public void disable() {
		this.on = false;
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return this.volume;
	}

	@Override
	public void setVolume(int volume) {
		if (volume > 100) {
			this.volume = 100;
		}
		if (volume < 0) {
			this.volume = 0;
		} else {
			this.volume = volume;
		}

	}

	@Override
	public int getChannel() {
		return this.channel;
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public void printStatus() {
		System.out.println("------------------------------------");
		System.out.println("| I'm TV.");
		System.out.println("| I'm " + (on ? "enabled" : "disabled"));
		System.out.println("| Current volume is " + volume + "%");
		System.out.println("| Current channel is " + channel);
		System.out.println("------------------------------------\n");

	}

}
