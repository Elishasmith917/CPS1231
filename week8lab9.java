package demo8;

public class week8lab9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        double sum=0;

		        for (int i = 1; i <= 97; i += 2) {
		            double numerator = i;
		            double denominator = i + 2;
		            sum += numerator / denominator;
		        }

		        System.out.println("Sum of the series: " + sum);
		    }
	}

