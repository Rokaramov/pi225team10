package circle;

public abstract class abstr {
	private double result;
	public double chet(Double Pi, Double R, Double a) {
		result=(((Pi * (R * R))/360) * a);
		return result;
	}	
}
