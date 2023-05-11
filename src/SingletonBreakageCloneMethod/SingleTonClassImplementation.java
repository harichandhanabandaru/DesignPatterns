package SingletonBreakageCloneMethod;



public class SingleTonClassImplementation {

    public static void main(String[] args) throws CloneNotSupportedException {
        DriverClone driver1= DriverClone.getInstance();
        DriverClone driver2= (DriverClone) driver1.clone();

        System.out.println(driver1.hashCode());
        System.out.println(driver2.hashCode());


        driver1.increaseTableCount(2);
        driver2.totalRowCount(10);
        driver1.increaseTableCount(20);
        driver2.totalRowCount(10);




    }
}
