package Singleton;

public class Driver {


    private int tableCount=0;
    static Driver driver =new Driver("Drive");

    private String schemaName;
    private Driver(String schemaName)
    {
       this.schemaName=schemaName;
    }
    public static Driver getInstance()
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
