package SingletonBreakageReflectionMethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleTonReflectionClassImplementation {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        DriverReflection driver1 = DriverReflection.getInstance();
        DriverReflection driverReflectionInstance = null;

        Constructor[] constructors = DriverReflection.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            driverReflectionInstance = (DriverReflection) constructor.newInstance("Drive");
        }

        System.out.println(driver1.hashCode());
        System.out.println(driverReflectionInstance.hashCode());

        driver1.increaseTableCount(2);
        driverReflectionInstance.totalRowCount(10);
        driver1.increaseTableCount(20);
        driverReflectionInstance.totalRowCount(10);
    }

}
