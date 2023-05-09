package Factory;

import java.util.Scanner;
import Factory.Interface.Calculator;

public class FactoryMain {

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);

    System.out.println("please select the calculator  type <Basic|Scientific|Programming>");
    String mode = sc.next();
    sc.nextLine();
    String commandLineInput;

    switch (mode){
        case "Basic":
            Calculator calculator = CalculatorFactory.getCalculator("Basic");
            System.out.println("Enter two numbers in the format of '<operand> <operator> <operand>'. 'ex: + 1 2' ");
            commandLineInput = sc.nextLine();
            calculator.calculate(commandLineInput);
            break;

        case "Scientific":
            Calculator scientificCalculator = CalculatorFactory.getCalculator("Scientific");
            System.out.println("Enter an operand and operator in the format of '<sin|cos|tan> <operand>'. 'ex: sin 0' ");
            commandLineInput = sc.nextLine();
            scientificCalculator.calculate(commandLineInput);
            break;

        case "Programming":
            Calculator programingCalculator = CalculatorFactory.getCalculator("Programming");
            System.out.println("Enter binary or decimal number to perform the operations `ex: 113` `ex:ob1110001` ");
            commandLineInput = sc.next();
            programingCalculator.calculate(commandLineInput);
            break;
        default :
            System.out.println("Exited with unknown calculator mode");
            System.exit(0);
    }
}
}
