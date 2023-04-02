package com.skill.distillery.jets.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skill.distillery.jets.entities.AirField;
import com.skill.distillery.jets.entities.Bomber;
import com.skill.distillery.jets.entities.Cargo;
import com.skill.distillery.jets.entities.Drone;
import com.skill.distillery.jets.entities.Fighter;
import com.skill.distillery.jets.entities.Jet;

public class JetsApplication extends AirField {

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		List<Jet> fleet = new ArrayList<>();
		
		fleet = ja.readFromList();
		
		ja.menu(fleet);	
	}
	
	public void menu(List<Jet> fleet) {
		Scanner sc = new Scanner(System.in);
		boolean keepGoing = true;
		
		while(keepGoing) {
			
			System.out.println("Please select a choice \n"
				+ "1:List fleet \n"
				+ "2:Fly all jets \n"
				+ "3:View fastest \n"
				+ "4:View the jet with the longest range \n"
				+ "5:Use Drones to conduct a recon mission \n"
				+ "6:Use Bombers to conduct a bombing run \n"
				+ "7:Load Cargo jets \n"
				+ "8:Add a jet to the Fleet \n"
				+ "9:Remove a jet from the Fleet \n"
				+ "0:Quit");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				listJets(fleet);
			}
			if(choice == 2) {
				fly(fleet);
			}
			if(choice == 3) {
				fastestJet(fleet);
			}
			if(choice == 4) {
				longestRange(fleet);
			}
			if(choice == 5) {
				reconAllDrones(fleet);
			}
			if(choice == 6) {
				sendAllBombers(fleet);
			}
			if(choice == 7) {
				loadAllCargos(fleet);
			}
			if(choice == 8) {
				fleet = addJet(fleet);
			}
			if(choice == 9) {
				fleet = removeJet(fleet);
			}
			if(choice == 0) {
				System.out.println("Thanks for using our airfield, goodybye!");
				keepGoing = false;
			}
		
			
		}
		sc.close();
		
	}
	
	
	public void listJets(List<Jet> fleet) {
		
		for (int i = 0; i < fleet.size(); i++) {
			Jet listyJet = fleet.get(i);
			System.out.println(listyJet);
		}
	}
	

	
	public void fastestJet(List<Jet> fleet) {
		String winName = null;
		double winSpeed = 0;
		
		for (int i = 0; i < fleet.size(); i++) {
			
			Jet speedyJet = fleet.get(i);
			
			String name = speedyJet.getModel();
			
			if (speedyJet.getSpeed() > winSpeed) {
				winSpeed = speedyJet.getSpeed();
				winName = name;
				
			}
			
		}
		System.out.println("The fastest jet is the " + winName + " with a top speed of " + winSpeed + " MPH \n");
		
	}
	
	public void longestRange(List<Jet> fleet) {
		String winName = null;
		double winRange = 0;
		
		for (int i = 0; i < fleet.size(); i++) {
			
			Jet longJet = fleet.get(i);
			
			String name = longJet.getModel();
			
			if (longJet.getRange() > winRange) {
				winRange = longJet.getRange();
				winName = name;
				
			}
			
		}
		System.out.println("The jet with the longest range is the " + winName + " with a range of " + winRange + " miles \n");
		
	}
	
	public List<Jet> addJet(List<Jet>fleet) {
		String model;
		double speed;
		int range;
		long price;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the model of the Jet");
		model = sc.next();
		
		System.out.println("Please enter the top speed of the Jet");
		speed = sc.nextDouble();
		
		System.out.println("Please enter the range of the Jet");
		range = sc.nextInt();
		
		System.out.println("Please enter the price of the Jet in millions");
		price = sc.nextLong();
		
		Jet addedJet = new Fighter(model, speed, range, price);
		
		fleet.add(addedJet);
		
		return fleet;
	}
	
	public List<Jet> removeJet(List<Jet> fleet) {
		Scanner sc = new Scanner(System.in);
		String jetName = null;
		int choice = 0;
		
		System.out.println("Which jet would you like to remove?");
		
		for (int i = 0; i < fleet.size(); i++) {
			Jet removedJet = fleet.get(i);
			jetName = removedJet.getModel();
			System.out.println(i+1 + ": The " + jetName);
		}
		choice = sc.nextInt();
		fleet.remove(choice-1);
		
		
		return fleet;
	}
	
	public void loadAllCargos(List<Jet> fleet) { 
		for (int i = 0; i < fleet.size(); i++) {
			Jet tester = fleet.get(i);
			Class<? extends Jet> classType = tester.getClass();
			String jetType = classType.getSimpleName();
		
				if (jetType.equalsIgnoreCase("Cargo")) {
					((Cargo)tester).loadUp();
				}
			
		}
	}
	
	public void reconAllDrones(List<Jet> fleet) { 
		for (int i = 0; i < fleet.size(); i++) {
			Jet tester = fleet.get(i);
			Class<? extends Jet> classType = tester.getClass();
			String jetType = classType.getSimpleName();
			
			if (jetType.equalsIgnoreCase("Drone")) {
				((Drone)tester).conductRecon();
			}
			
			
			
		}
	}
	
	public void sendAllBombers(List<Jet> fleet) { 
		for (int i = 0; i < fleet.size(); i++) {
			Jet tester = fleet.get(i);
			
			Class<? extends Jet> classType = tester.getClass();
			String jetType = classType.getSimpleName();
			
			if (jetType.equalsIgnoreCase("bomber")) {
				((Bomber)tester).conductBR();
			}
			
			
		}
	}
	


}




















