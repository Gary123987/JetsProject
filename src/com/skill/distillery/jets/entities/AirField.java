package com.skill.distillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField extends Jet {
	

	

		
	public List<Jet> readFromList() {
		List<Jet> jets = new ArrayList<>();
		BufferedReader bufIn = null;
		try {
		  bufIn = new BufferedReader(new FileReader("Jets2.txt"));
		  String line;
		  while ((line = bufIn.readLine()) != null) {
			  
			  
			  String[] jetDetails = line.split(",");
			  

			  
			  if (jetDetails[0].equalsIgnoreCase("Drone")) {
				  
				  String model = jetDetails[1];
				  double speed = Double.parseDouble(jetDetails[2]);
				  int range = Integer.parseInt(jetDetails[3]);
				  long price = Long.parseLong(jetDetails[4]);
				  double visionRange = Double.parseDouble(jetDetails[5]);
				  
				  Jet newDrone = new Drone(model, speed, range, price, visionRange);
				  				  
				  jets.add(newDrone);
				  
			  }
			  
			  if (jetDetails[0].equalsIgnoreCase("Cargo")) {
				  String model = jetDetails[1];
				  double speed = Double.parseDouble(jetDetails[2]);
				  int range = Integer.parseInt(jetDetails[3]);
				  long price = Long.parseLong(jetDetails[4]);
				  int capacity = Integer.parseInt(jetDetails[5]);
				  
				  Jet newCargo = new Cargo(model, speed, range, price, capacity);
				  				  
				  jets.add(newCargo);
				  
			  }
			  
			  if (jetDetails[0].equalsIgnoreCase("Fighter")) {
				  String model = jetDetails[1];
				  double speed = Double.parseDouble(jetDetails[2]);
				  int range = Integer.parseInt(jetDetails[3]);
				  long price = Long.parseLong(jetDetails[4]);
				  
				  Jet newFighter = new Fighter(model, speed, range, price);
				  				  
				  jets.add(newFighter);
				  
			  }
			  
			  if (jetDetails[0].equalsIgnoreCase("Bomber")) {
				  String model = jetDetails[1];
				  double speed = Double.parseDouble(jetDetails[2]);
				  int range = Integer.parseInt(jetDetails[3]);
				  long price = Long.parseLong(jetDetails[4]);
				  String payload = jetDetails[5];
				  
				  Jet newBomber = new Bomber(model, speed, range, price, payload);
				  
				  jets.add(newBomber);
				  
			  }
			  
			  			  
		  }
		}
		catch (IOException e) {
		  System.err.println(e);
		}
		finally {
		  if (bufIn != null) {
		    try {
		      bufIn.close();
		    }
		    catch (IOException e) {
		      System.err.println(e);
		    }
		  }
		}
	
	return jets;
		
		
	}
}
