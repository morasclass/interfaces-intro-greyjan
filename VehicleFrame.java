//Question #9
//Jan Fic

public class VehicleFrame implements  Chassis {
	
	String vehicleFrameType;
	
	public VehicleFrame() {
		vehicleFrameType = "Unibody";
	}
	
	public VehicleFrame(String vehicleFrameType) {
		this.vehicleFrameType = vehicleFrameType;
	}
	
	public Chassis getChassisType() {
		return this;
	}
	
	public void setChassisType(String vehicleFrameType) {
		this.vehicleFrameType = vehicleFrameType;
	}
	
	@Override
	public String toString() {
		return "Chassis\t\t: Chassis\nVehicle Frame:\t: " + vehicleFrameType;
	}
	
	public static void main(String[] args) {
		
		System.out.println("=================Scenario 1");
		VehicleFrame v1 = new VehicleFrame();
		System.out.println(v1.toString());
		System.out.println("=================Scenario 2");
		VehicleFrame v2 = new VehicleFrame("Ladder Frame");
		System.out.println("Vehicle Frame:\t: " + v2.vehicleFrameType);
	}
}