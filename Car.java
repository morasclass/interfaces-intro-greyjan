//Try It/ Solve It
//Question #10
//Jan Fic

import java.util.Date;

public class Car extends Vehicle {
	
	private Feature[] feature = new Feature[10];
	private int carAxle;
	
	public Car() {
		super();
		carAxle = 0;
	}
	
	public Car(
		Date vehicleManufacturedDate,
		String vehicleManufacturer,
		String vehicleMake,
		String vehicleModel,
		String vehicleType,
		String driveTrain,
		Chassis vehicleFrame,
		Engine vehicleEngine,
		Feature[] feature,
		int carAxle) {
		super(vehicleManufacturedDate,vehicleManufacturer, vehicleMake, vehicleModel,vehicleType,driveTrain,vehicleFrame,vehicleEngine);
		this.feature = feature;
		this.carAxle = carAxle;
	}
	
	public String getInteriorFeatures() {
		
		String r = "";
		
		for(int i = 0; i < feature.length; i++ ) {
			if(feature[i] != null  && feature[i].getClass()== InteriorFeature.class) {
				r += feature[i].toString( ) + "\n";
			}
		}
		
		return r;
	}
	
	public String getExteriorFeatures() {
		String r = "";
		
		for(int i = 0; i < feature.length; i++ ) {
			if(  feature[i] != null  &&feature[i].getClass() == ExteriorFeature.class ) {
				r += feature[i].toString() + "\n";
			}
		}
		
		return r;
	}
	
	@Override
	public String toString() {
		return	"Manufacturer Name\t: " + vehicleManufacturer +"\n" + 
				"Manufactured Date\t: " + vehicleManufacturedDate + "\n" + 
				"Vehicle Make\t: " + vehicleMake + "\n" + 
				"Vehicle Model\t: " + vehicleModel + "\n" +
				"Vehicle Type\t: " + vehicleType + "\n" + 
				vehicleEngine.toString() + "\n" +
				"Features\t\t\t: " +
				getExteriorFeatures() +
				"\t\t\t\t: " + 
				getInteriorFeatures();
	}
	
	public static void main(String[] args) {
		
		Car c = new Car(	new Date(),
						"Honda",
						"Honda" ,
						"Prelude",
						"null",
						"2WD: Two-Wheel Drive",
						new VehicleChassis(), 
						new ManufacturedEngine("Honda", new Date(),"H-Series","H23A1",4,"88AKI","2WD: Two-Wheel Drive"),
						new Feature[] {new ExteriorFeature("Wood Panels") , new InteriorFeature("AM/FM Radio")},
						5
						);
		System.out.println(c);
		
	}
}
