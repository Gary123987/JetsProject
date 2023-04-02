package com.skill.distillery.jets.entities;

public class Fighter extends Jet {
	
	public Fighter() {
		super();
	}
	public Fighter(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	@Override
	public String toString() {
		return "A Fighter " + super.toString() + "\n";
		
	}
	
	

}
