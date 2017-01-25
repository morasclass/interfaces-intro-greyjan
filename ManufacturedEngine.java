//Try It/ Solve It
//Question #5
//Jan Fic

import java.util.Date;

public class ManufacturedEngine implements Engine{
	private String engineManufacturer;
	private Date engineManufacturedDate;
	private String engineMake;
	private String engineModel;
	private int engineCylinders;
	private String engineType;
	private String driveTrain;
	
	public ManufacturedEngine() {
		engineManufacturer = "Generic Engine Manufactured";
		engineManufacturedDate = new Date();
		engineMake = "Generic";
		engineModel = "Generic";
		engineCylinders = 0;
		engineType = "85 AKI";
		driveTrain = "2WD: Two-Wheel Drive";
	}
	
	public ManufacturedEngine(String engineManufacturer,Date engineManufacturedDate,String engineMake, String engineModel, int engineCylinders, String engineType, String driveTrain) {
		this.engineManufacturer = engineManufacturer + " Engine Manufactured";
		this.engineManufacturedDate = engineManufacturedDate;
		this.engineMake = engineMake;
		this.engineModel = engineModel;
		this.engineCylinders = engineCylinders;
		this.engineType = engineType;
		this.driveTrain = driveTrain;
	}
	
	public void setEngineCylinders(int engineCylinders) {
		this.engineCylinders = engineCylinders;
	}
	
	public void setEngineManufacturedDate(Date date) {
		this.engineManufacturedDate = engineManufacturedDate;
	}
	
	public void setEngineMake(String engineMake) {
		this.engineMake = engineMake;
	}
	
	public void setEngineModel(String engineModel) {
		this.engineModel = engineModel;
	}
	
	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}
	
	public void setEngineType(String fuel) {
		this.engineType = engineType;
	}
	
	@Override
	public String toString() {
		return  "EngineManufacturer\t: " 		+ engineManufacturer 			+ "\n" + 
				"EngineManufactured\t: " 		+ engineManufacturedDate 		+ "\n" + 
				"Engine Make\t\t: " 			+ engineMake 				+ "\n" + 
				"Engine Model\t\t: " 			+ engineMake 				+ "\n" + 
				"Engine Type\t\t: " 			+ engineType 				+ "\n" + 
				"Engine Cylinders\t: " 		+ engineCylinders			+ "\n" + 
				"Drive Train\t\t: " 			+ driveTrain;
	}
	
	public static void main(String[] args) {
		System.out.println("=================Scenario 1");
		ManufacturedEngine me1 = new ManufacturedEngine();
		System.out.println(me1);
		System.out.println("=================Scenario 2");
		ManufacturedEngine me2 = new ManufacturedEngine("Honda", new Date(),"H-Series","H23A1",4,"88AKI","2WD: Two-Wheel Drive");
		System.out.println(me2);
	}
}