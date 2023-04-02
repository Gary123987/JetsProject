package com.skill.distillery.jets.entities;

public interface BombingRun{
	
	public default void conductBR() {
		System.out.println("Dropping payload, look out below! \n");
	}

}
