package week1.day2.assignment;

public class MyCalculator {
public static void main(String[] args) {
	Calculator cal = new Calculator();
	System.out.println("Addition- "+cal.add(2, 3,4));
	System.out.println("Subtraction- "+cal.sub(3, 2));
	System.out.println("Multiplication- "+cal.mul(2.0, 3.0));
	System.out.println("Division- "+cal.divide(10.0f, 2.0f));
}
	
}
