package com.skill.distillery.jets.entities;

public class Drone extends Jet implements ReconMission{
	private double visionRange;
	
	
	public Drone() {
		
	}

	public Drone(String model, double speed, int range, long price, double visionRange) {
		super(model, speed, range, price);
		this.visionRange = visionRange;
	}

	@Override
	public String toString() {
		return "A Drone " + super.toString() + " with optics that can see up to " + visionRange + " miles\n";
	}

	public double getVisionRange() {
		return visionRange;
	}

	public void setVisionRange(double visionRange) {
		this.visionRange = visionRange;
	}
	
	
	

}
