package SingletonBreakageSerialiazableMethod;

import java.io.*;

public class SingleTonSerializationClassImplementation {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        DriverSerialization driver1 = DriverSerialization.getInstance();

        ObjectOutput out=new ObjectOutputStream(new FileOutputStream("Single ton seriable"));
        out.writeObject(driver1);
        out.close();

        ObjectInput in=new ObjectInputStream(new FileInputStream("Single ton seriable"));
        DriverSerialization instance2=(DriverSerialization) in.readObject();
        in.close();

        System.out.println(driver1.hashCode());
        System.out.println(instance2.hashCode());

        driver1.increaseTableCount(2);
        instance2.totalRowCount(10);
        driver1.increaseTableCount(20);
        instance2.totalRowCount(10);
    }

}
