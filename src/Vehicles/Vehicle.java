package Vehicles;

public class Vehicle {
	
	String serialNumber;
	int noPersons;
	String name;
	
	public Vehicle(String serialNumber, int noPersons) {
		this.serialNumber = serialNumber;
		this.noPersons = noPersons;
	}
	
	public Vehicle(String serialNo, int noP, String name) {
		this.serialNumber = serialNo;
		this.noPersons = noP;
		this.name = name;
	}
	
	
	public final String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getNoPersons() {
		return noPersons;
	}
	public void setNoPersons(int noPersons) {
		this.noPersons = noPersons;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	boolean goTo(double posX, double posY) {
		System.out.println("Error: Unknown vehicle canoot move...");
		return false;
	}
	boolean addFuel(double ammount) {
		System.out.println("Error: unknown type of vehicle…");
		return false;
	}
	public void printInfo() {
		System.out.println("Vehicle properties: \n\t- serial number: " + this.getSerialNumber() + 
				" \n\t- capaccity: " + this.getNoPersons() + "\n\t- name: " + this.name);
	}
	
	

}
