package com.skill.distillery.jets.entities;

import java.util.List;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	
	public Jet() {
		
	}
	
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly(List<Jet> fleet) {

		
		for (int i = 0; i < fleet.size(); i++) {
			
			Jet flyingJet = fleet.get(i);
			
			double range = flyingJet.getRange();
			double speed = flyingJet.getSpeed();
			String name = flyingJet.getModel();
			double hours = range / speed;
			
			System.out.println("The " + name + " can fly for " + hours + " hours \n");
			
		}
		
	}

	@Override
	public String toString() {
		return "designation " + model + ", capable of a speed of " + speed + " MPH,  with a range of " + range + " miles, costing " + price + " million dollars";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	
	
	

	
	
	

}
