package week1day2;

public class Calculator {

	public int add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
		//System.out.println("THE ADDITION IS " + sum);
	}

	public int sub(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	    //System.out.println(" THE SUBTRACTION IS " + sub);

	}
	
	public double mul(double num1, double num2) {
		double mul = num1*num2;
		return mul;
		//System.out.println("THE MULTIPLICATION IS " + mul);
	}
	
	public float div(float num1, float num2) {
		float div = num1/num2;
		return div;
		//System.out.println("THE DIVISION IS " + div);
		
	}
}
