//Try It/ Solve It
//Question #8
//Jan Fic

public class ExteriorFeature implements Feature {
	String exteriorFeature;
	
	public ExteriorFeature() {
		exteriorFeature = "Generic";
	}
	
	public ExteriorFeature(String exteriorFeature) {
		this.exteriorFeature = exteriorFeature;
	}
	
	public String getFeature() {
		return exteriorFeature;
	}
	
	public void setFeature(String exteriorFeature) {
		this.exteriorFeature = exteriorFeature;
	}
	
	@Override
	public String toString() {
		return "Exterior [" + getFeature() + "]";
	}
	
	public static void main(String[] args) {
		System.out.println(new ExteriorFeature());
		System.out.println(new ExteriorFeature("Fog Lamps"));
	}
}