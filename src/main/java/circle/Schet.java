package circle;

public class Schet extends abstr{
	
	public double sum = 0;
	
	public Schet(double Pi, double R, double a) {
		sum = chet(Pi, R, a);
	}
	public double getSum() {
		return sum;
	}
}
