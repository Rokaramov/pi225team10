package circle;

public class Schet extends abstr{
	
	public double sum = 0;
	
	public Schet(Double Pi, Double R, Double a) {
		sum = chet(Pi, R, a);
	}
	public double getSum() {
		return sum;
	}
}
