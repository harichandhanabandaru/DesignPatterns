package Factory;


import Factory.Calculators.BasicCalculator;
import Factory.Calculators.ProgrammingCalculator;
import Factory.Calculators.ScientificCalculator;
import Factory.Interface.Calculator;

public class CalculatorFactory {

    public static Calculator getCalculator(String mode)
    {
        switch (mode) {
            case "Basic":
                return new BasicCalculator();
            case "Scientific":
                return new ScientificCalculator();
            case "Programming":
                return new ProgrammingCalculator();
            default:
                return null;
        }
    }
}
