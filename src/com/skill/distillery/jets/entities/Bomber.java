package com.skill.distillery.jets.entities;

public class Bomber extends Jet implements BombingRun{
	private String payload;
	
	public Bomber() {
		
	}

	public Bomber(String payload) {
		super();
		this.payload = payload;
	}

	public Bomber(String model, double speed, int range, long price, String payload) {
		super(model, speed, range, price);
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "A Bomber " + super.toString() + " carrying a payload of " + payload + "\n";
	}
	
	
	
	
	

}
