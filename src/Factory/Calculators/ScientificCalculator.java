package Factory.Calculators;

import Factory.Interface.Calculator;

public class ScientificCalculator implements Calculator {


    public void sinValue(int num)
    {
        System.out.println(Math.sin(num));
    }

    public void cosValue(int num)
    {
        System.out.println(Math.cos(num));
    }

    public void tanValue(int num)
    {
        System.out.println(Math.tan(num));
    }
    @Override
    public void calculate(String expression) {
        String[] args = expression.split(" ",2);
        String operation = args[0];
        int num = Integer.parseInt(args[1]);

        switch (operation) {
            case "sin":
                sinValue(num);
                break;
            case "cos":
                cosValue(num);
                break;
            case "tan":
                tanValue(num);
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
