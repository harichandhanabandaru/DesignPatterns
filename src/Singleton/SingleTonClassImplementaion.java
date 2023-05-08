package Singleton;


public class SingleTonClassImplementaion {
    public static void main(String[] args)
    {
        Driver driver1= Driver.getInstance();
        Driver driver2= Driver.getInstance();

        driver1.increaseTableCount(2);
        driver2.totalRowCount(10);
        driver1.increaseTableCount(20);
        driver2.totalRowCount(10);




    }
}
