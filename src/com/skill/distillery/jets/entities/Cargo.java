package com.skill.distillery.jets.entities;

public class Cargo extends Jet implements CargoLoadUp{
	private int troopCapacity;
	

	public Cargo() {
		
	}

	public Cargo(String model, double speed, int range, long price, int troopCapacity) {
		super(model, speed, range, price);
		this.troopCapacity = troopCapacity;
	}

	@Override
	public String toString() {
		return  "A Cargo jet " +super.toString() + " carrying up to " + troopCapacity + " troops \n";
	}

	public int getTroopCapacity() {
		return troopCapacity;
	}

	public void setTroopCapacity(int troopCapacity) {
		this.troopCapacity = troopCapacity;
	}
	
	
	
	
	

}
