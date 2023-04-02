package com.skill.distillery.jets.entities;

public interface CargoLoadUp {
	default void loadUp() {
		System.out.println("The carg-, oops I mean troops, are being loaded \n");
	}
}
