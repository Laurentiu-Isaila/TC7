package Vehicles;

public class OnAir extends Vehicle {
	
	private int noTurbines = 2;
	private boolean hasFirstClass;
	private String hasFC = "- has first class.";
	private String noFC = "- does not have first class";
	
	
	
	public String getHasFC() {
		return hasFC;
	}
	public void setHasFC(String hasFC) {
		this.hasFC = hasFC;
	}
	public String getNoFC() {
		return noFC;
	}
	public void setNoFC(String noFC) {
		this.noFC = noFC;
	}
	public int getNoTurbines() {
		return noTurbines;
	}
	public void setNoTurbines(int noTurbines) {
		this.noTurbines = noTurbines;
	}
	public boolean isHasFirstClass() {
		return hasFirstClass;
	}
	public void setHasFirstClass(boolean hasFirstClass) {
		this.hasFirstClass = hasFirstClass;
	}
	
	
		
	public OnAir(String serialNo, int noPersons) {
		super(serialNo, noPersons);
	}
	
	public OnAir(String serialNo, int noPersons, String name) {
		super(serialNo, noPersons, name);
	}
	
	public OnAir(String serialNo, int noPersons, String name, int noTurbines) {
		super(serialNo, noPersons, name);
		this.noTurbines = noTurbines;
	}
	
	public OnAir(String serialNo, int noPersons, String name, int noTurbines, boolean hasFC) {
		super(serialNo, noPersons, name);
		this.noTurbines = noTurbines;
		this.hasFirstClass = hasFC;
	}
	
	@Override
	boolean goTo(double posX, double posY) {
		System.out.println("Flying the airplane to coordinates: [" + posX + "-" + posY + " ]");
		return true;
	}
	
	@Override
	boolean addFuel(double ammount) {
		System.out.println("Adding " + ammount + " l of fuel to the airplane.");
		return true;
	}
	
	@Override
	public void printInfo() {
		System.out.print("Vehicle properties: \n\t- serial number: " + this.getSerialNumber() + 
				" \n\t- capaccity: " + this.getNoPersons() + "\n\t- name: " + this.name);
		System.out.print("\nPlane properties: \n\t- number of turbines: " + this.getNoTurbines());
		if (this.isHasFirstClass()) {
			System.out.print("\n\t" + this.getHasFC());
		} else {
			System.out.print("\n\t" + this.getNoFC());
		}
		
	}
	

}
