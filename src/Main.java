import Vehicles.OnAir;
import Vehicles.OnRoad;
import Vehicles.Vehicle;

public class Main {

	public static void main(String[] args) {
		Vehicle car = new Vehicle("233ff", 5, "audi");
		car.printInfo();
		OnRoad jeep = new OnRoad("342354gff", 4, "jeep", 4, 4);
		jeep.printInfo();
		
		OnAir plane = new OnAir ("3243", 4, "plane", 2, false);
		plane.printInfo();

	}

}
