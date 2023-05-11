package SingletonBreakageSerialiazableMethod;

import java.io.Serializable;

public class DriverSerialization extends MyCloneSerialization implements Serializable {


    private int tableCount=0;
    static DriverSerialization driver=new DriverSerialization("Drive");



    private String schemaName;
    private DriverSerialization(String schemaName)  {
        this.schemaName=schemaName;

    }
//    We are sending same object  in serialization methos
protected Object readResolve()
{
    return driver;
}

    public static DriverSerialization getInstance()
    {
        return driver;
    }

    public void increaseTableCount(int tableCountArg)
    {
        this.tableCount=this.tableCount+tableCountArg;
        System.out.println( " Table count for "+schemaName+" is "+tableCount);
    }

    public void totalRowCount(int singleTableRowCount)
    {
        int totalRowCount=this.tableCount*singleTableRowCount;
        System.out.println( " Table row count for "+schemaName+" is "+totalRowCount);

    }





}
