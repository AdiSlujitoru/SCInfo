
public class Calculator {
	private double x1;
	private double x2;
	private String operation;
	private double result;

	public void calculate(double a, double b, String op) {
		switch (op) {
		case ("add"):
			result = a + b;
			break;
		case ("substract"):
			result = a - b;
			break;
		case ("multiply"):
			result = a * b;
			break;
		case ("divide"):
			result = a / b;
			break;
		}
		System.out.print("Result = " + result);
	}

	public Calculator(double x1, double x2, String op) {
		this.x1 = x1;
		this.x2 = x2;
		this.operation = op;
		calculate(x1, x2, operation);
	}
}
