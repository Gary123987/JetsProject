package com.skill.distillery.jets.entities;

public interface ReconMission {
	default void conductRecon() {
		System.out.println("We see them, but they can't see us! \n");
	}
}
