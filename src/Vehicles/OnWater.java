package Vehicles;

public class OnWater extends Vehicle {
	
	private int noEngines = 2;
	private int cargoCapacity;
	
	
	 
	public int getNoEngines() {
		return noEngines;
	}

	public void setNoEngines(int noEngines) {
		this.noEngines = noEngines;
	}

	public int getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public OnWater(String serialNo, int noPersons) {
		super(serialNo, noPersons);
	}
	
	public OnWater(String serialNo, int noPersons, String name) {
		super(serialNo, noPersons, name);
	}
	
	public OnWater(String serialNo, int noPersons, String name, int noEngines) {
		super(serialNo, noPersons, name);
		this.noEngines = noEngines;
	}
	
	public OnWater(String serialNo, int noPersons, String name, int noEngines, int cargoCapacity) {
		super(serialNo, noPersons, name);
		this.noEngines = noEngines;
		this.cargoCapacity = cargoCapacity;
	}
	
	@Override
	boolean goTo(double posX, double posY) {
		System.out.println("Sailing the vessel to coordinates: [" + posX + "-" + posY + " ]");
		return true;
	}
	
	@Override
	boolean addFuel(double ammount) {
		System.out.println("Adding " + ammount + " l of fuel to the vessel.");
		return true;
	}
	
	@Override
	public void printInfo() {
		System.out.print("Vehicle properties: \n\t- serial number: " + this.getSerialNumber() + 
				" \n\t- capaccity: " + this.getNoPersons() + "\n\t- name: " + this.name);
		System.out.print("\nVessel properties: \n\t- number of engines: " + this.getNoEngines() +
				"\n\t- cargo capacity: " + this.getCargoCapacity());
	}
	
	

}
