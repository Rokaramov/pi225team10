package circle;

public class abstr {
	private double result;
	private final static double Pi = 3.1415926536;
	public double chet(double Pi, double R, double a) {
		result=(((Pi * (R * R))/360) * a);
		return result;
	}	
	public static double getPi() {
		return Pi;		
	}
}
