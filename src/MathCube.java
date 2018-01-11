public class MathCube {
	public static void main(String[] args){
		double x, y;
		int	FoundAnswer = 0;
		double EPSILON = .000001;
		for(x = -3; x < 3; x = x + EPSILON * .01){
			y = Math.pow(x, 3) + 2;
			if(Math.abs(x - y) < EPSILON){
				if(EPSILON >= 1 )
					System.out.format("%.0f", x);
				else if(EPSILON >= .1)
					System.out.format("%.1f", x);
				else if(EPSILON >= .01)
					System.out.format("%.2f", x);
				else if(EPSILON >= .001)
					System.out.format("%.3f", x);
				else if(EPSILON >= .0001)
					System.out.format("%.4f", x);
				else if(EPSILON >= .00001)
					System.out.format("%.5f", x);
				else if(EPSILON >= .000001)
					System.out.format("%.6f", x);
				FoundAnswer = 1;
				break;
			}
		}
		if (FoundAnswer == 0)
			System.out.println("Didn't find an answer.");
	}
}