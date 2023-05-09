package Factory.Calculators;

import Factory.Interface.Calculator;

public class ProgrammingCalculator implements Calculator {

    public void binaryToDecimal(String binary){
        System.out.println(Integer.parseInt(binary, 2));
    }

    public void decimalToBinary(int decimal) {
        System.out.println(Integer.parseInt(Integer.toBinaryString(decimal)));
    }
    @Override
    public void calculate(String expression) {
        System.out.println(expression);

        if(!expression.matches("[0-9]+")){
            binaryToDecimal(expression.substring(2));
        }else {
            decimalToBinary(Integer.parseInt(expression));
        }
    }
}
