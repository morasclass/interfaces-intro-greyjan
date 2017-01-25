//Try It/ Solve It
//Question #7
//Jan Fic

public class InteriorFeature implements Feature {
	
	String interiorFeature;
	
	public InteriorFeature() {
		interiorFeature = "Generic";
	}
	
	public InteriorFeature(String interiorFeature) {
		this.interiorFeature = interiorFeature;
	}
	
	public String getFeature() {
		return interiorFeature;
	}
	
	public void setFeature(String feature) {
		interiorFeature = feature;
	}
	
	@Override
	public String toString() {
		return "Interior [" + interiorFeature + "]";
	}
	
	public static void main(String[] args) {
		
		System.out.println("=================Scenario 1");
		InteriorFeature i1 = new InteriorFeature();
		System.out.println(i1);
		System.out.println("=================Scenario 2");
		InteriorFeature i2 = new InteriorFeature("Climate Control");
		System.out.println(i2);
	}
	
}