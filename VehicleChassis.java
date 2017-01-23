//Question #3
//Jan Fic

public class VehicleChassis implements Chassis{
	
	String chassisName;
	
	public VehicleChassis() {
		chassisName = chassis;
	}
	
	public VehicleChassis(String chassisName) {
		this.chassisName = chassisName;
	}
	
	public Chassis getChassisType() {
		return this;
	}
	
	public void setChassisType(String vehicleChassis) {
		chassisName = vehicleChassis;
	}
	
	public String toString() {
		return "Chassis Name\t: Chassis";
	}

	public static void main(String[] args) {
		
		VehicleChassis v1 = new VehicleChassis();
		VehicleChassis v2 = new VehicleChassis("Car");
		
	}
}