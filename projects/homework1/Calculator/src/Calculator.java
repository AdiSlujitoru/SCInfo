import java.util.Scanner;
public class Calculator {
    static int ex() {
        String operator;
        double firstNumber, secondNumber;
        Scanner scan=new Scanner(System.in);
        System.out.print("Numbers: ");
        firstNumber=scan.nextDouble();
        secondNumber=scan.nextDouble();
        System.out.print("Operator: ");
        operator=scan.next();
        scan.close();
        System.out.print("Result = ");
        switch (operator) {
            case "+":
                System.out.println(firstNumber+secondNumber);
                break;

            case "-":
                System.out.println(firstNumber+secondNumber);
                break;

            case "*":
                System.out.println(firstNumber*secondNumber);
                break;

            case "/":
                System.out.println(firstNumber/secondNumber);
                break;
            default:
                System.out.println("Operator incorect!");
        }
        return 0;
    }

    public static void main(String[] args) {
        ex();
    }

}