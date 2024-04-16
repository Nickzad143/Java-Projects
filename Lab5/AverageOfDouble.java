public class AverageOfDouble {
	public static void main(String[] args) {
		


		double [] values = {3.12, 1.343, 2.78, 45.234, 343.12, 
		3.343, 3.12322, 43.34, 1.12, 45.34,23.879}; 
		double sum = 0.0;
		for (double value: values) {
			sum += value;
		}
		double Average = sum / values.length;
		System.out.println("The Average of the 10 double values are: " + Average);





	}
}