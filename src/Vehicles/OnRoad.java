package Vehicles;

public class OnRoad extends Vehicle {
	
	int noWheels = 4;
	int noDoors = 4;
	
	
	public int getNoWheels() {
		return noWheels;
	}

	public void setNoWheels(int noWheels) {
		this.noWheels = noWheels;
	}

	public int getNoDoors() {
		return noDoors;
	}

	public void setNoDoors(int noDoors) {
		this.noDoors = noDoors;
	}

	public OnRoad(String serialNo, int noPerson) {
		super( serialNo, noPerson);				
	}
	
	public OnRoad(String serialNo, int noPerson, String name) {
		super(serialNo, noPerson, name);
	}
	
	public OnRoad(String serialNo, int noPerson, String name, int noWheels) {
		super(serialNo, noPerson, name);
		this.setNoWheels(noWheels);
	}
	
	public OnRoad(String serialNo, int noPerson, String name, int noWheels, int noDoors) {
		super(serialNo, noPerson, name);
		this.setNoWheels(noWheels);
		this.setNoDoors(noDoors);
	}
	
	@Override
	boolean goTo(double posX, double posY) {
		System.out.println("Driving the vehicle on road to coordinates: [" + posX + "-" + posY + " ]");
		return true;
	}
	
	@Override
	boolean addFuel(double ammount) {
		System.out.println("Adding " + ammount + " l of fuel to the driving vehicle");
		return true;
	}
	
	@Override
	public void printInfo() {
		System.out.print("Vehicle properties: \n\t- serial number: " + this.getSerialNumber() + 
				" \n\t- capaccity: " + this.getNoPersons() + "\n\t- name: " + this.name);
		System.out.print("\nDriving vehicle properties: \n\t- number of wheels: " + this.getNoWheels() +
				"\n\t- number of doors: " + this.getNoDoors());
	}
	
	
	
	
	
	
	
	
	
	

}
