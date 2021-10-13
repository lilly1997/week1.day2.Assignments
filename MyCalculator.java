package week1day2;

public class MyCalculator {

	public static void main(String[] args) {
Calculator obj = new Calculator();

int add = obj.add(24, 76, 87);
int sub = obj.sub(78, 45);
double mul = obj.mul(78, 50);
float div = obj.div(65, 87);

System.out.println("THE ADDITION IS " + add);
System.out.println("THE SUBTRACTION IS " + sub);
System.out.println("THE MULTIPLICATION IS " + mul);
System.out.println("THE DIVISION IS " + div);
	}

}
