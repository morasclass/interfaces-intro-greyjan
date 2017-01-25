//Try It/ Solve It
//Question #9
//Jan Fic

import java.util.Date;

public class Vehicle implements Engine , Chassis {
	
	Date vehicleManufacturedDate; 
	String vehicleManufacturer, vehicleMake, vehicleModel,vehicleType,driveTrain; 
	Chassis vehicleFrame; 
	Engine vehicleEngine; 
	
	public Vehicle() {
		vehicleManufacturedDate = new Date();
		vehicleManufacturer = "Generic";
		vehicleMake = "Generic";
		vehicleModel = "Generic";
		vehicleType = "Generic";
		driveTrain = "Generic";
		vehicleFrame = new VehicleFrame();
		vehicleEngine = new ManufacturedEngine();
	}
	
	public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake, String vehicleModel,String vehicleType,String driveTrain,Chassis vehicleFrame,Engine vehicleEngine) {
		this.vehicleManufacturedDate = vehicleManufacturedDate;
		this.vehicleManufacturer = vehicleManufacturer;
		this.vehicleMake = vehicleMake;
		this.vehicleModel = vehicleModel;
		this.vehicleType = vehicleType;
		this.driveTrain = driveTrain;
		this.vehicleFrame = vehicleFrame;
		this.vehicleEngine = vehicleEngine;
	}
	
	public void setEngineCylinders(int engineCylinders) {
		vehicleEngine.setEngineCylinders(engineCylinders);
	}
	
	public void setEngineManufacturedDate(Date date)  {
		vehicleEngine.setEngineManufacturedDate(date);
	}
	
	public void setEngineMake(String engineMake)  {
		vehicleEngine.setEngineMake(engineMake);
	}
	
	public void setEngineModel(String engineModel) {
		vehicleEngine.setEngineModel(engineModel);
	}
	
	public void setDriveTrain(String driveTrain) {
		vehicleEngine.setDriveTrain(driveTrain);
	}
	
	public void setEngineType(String fuel) {
		vehicleEngine.setEngineType(fuel);
	}
	
	public Chassis getChassisType() {
		return this;
	}
	
	public void setChassisType(String vehicleChassis) {
		vehicleFrame.setChassisType(vehicleChassis);
	}
	
	@Override
	public String toString() {
		return	"Manufacturer Name\t: " + vehicleManufacturer +"\n" + 
				"Manufactured Date\t: " + vehicleManufacturedDate + "\n" + 
				"Vehicle Make\t: " + vehicleMake + "\n" + 
				"Vehicle Model\t: " + vehicleModel + "\n" +
				"Vehicle Type\t: " + vehicleType + "\n" + 
				vehicleEngine.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("=================Scenario 1");
		Vehicle v = new Vehicle();
		System.out.println(v);
				System.out.println("=================Scenario 2");
		Vehicle v2 = new Vehicle(new Date(), "Honda", "Honda" , "Prelude","null","2WD: Two-Wheel Drive", new VehicleChassis(), new ManufacturedEngine("Honda", new Date(),"H-Series","H23A1",4,"88AKI","2WD: Two-Wheel Drive") );
		System.out.println(v2);
	}
}