package aircraft;
public class Landing {
	public static String landing(String isItLanding) {
        return (isItLanding.equalsIgnoreCase("yes")) ? "The runway is NOT clear" : "The runway is clear";
	}
}