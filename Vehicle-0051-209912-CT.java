//Question #9
//Jan Fic

import java.util.Date;

public class Vehicle implements Engine , Chassis {
	
	private Date vehicleManufacturedDate; 
	private String vehicleManufacturer, vehicleMake, vehicleModel,vehicleType,driveTrain; 
	private Chassis vehicleFrame; 
	private Engine vehicleEngine; 
	
	public Vehicle() {
		vehicleManufacturedDate = new Date();
		vehicleManufacturer = "Generic";
		vehicleMake = "Generic";
		vehicleModel = "Generic";
		vehicleType = "Generic";
		driveTrain = "Generic";
		vehicleFrame = this;
		vehicleEngine = this;
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
		return "Manufacturer Name\t: " + vihicleManufacturer;
	}
}