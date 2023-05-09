package Factory.Calculators;

import Factory.Interface.Calculator;

public class BasicCalculator implements Calculator {
    public void add(int num1, int num2) {
        System.out.println(num1 +" + "+  num2 +" = "+(num1 + num2));
    }

    public void subtract(int num1, int num2) {
        System.out.println(num1 +" - "+  num2 +" = "+(num1 - num2));
    }

    public void multiply(int num1, int num2) {
        System.out.println(num1 +" * "+  num2 +" = "+(num1 * num2));
    }

    public void divide(int num1, int num2) {
        System.out.println(num1 +" / "+  num2 +" = "+(num1 / num2));
    }

    @Override
    public void calculate(String expression) {
        String[] args = expression.split(" ",3);
        String operation = args[0];
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);

        switch (operation) {
            case "+":
                add(num1, num2);
                break;
            case "-":
                subtract(num1, num2);
                break;
            case "/":
                divide(num1, num2);
                break;
            case "*":
                multiply(num1, num2);
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
