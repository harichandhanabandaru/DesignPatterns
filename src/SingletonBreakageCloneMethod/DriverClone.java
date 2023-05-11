package SingletonBreakageCloneMethod;

public class DriverClone extends MyClone {


    private int tableCount=0;
    static DriverClone driver =new DriverClone("Drive");

    private String schemaName;
    private DriverClone(String schemaName)
    {
        this.schemaName=schemaName;
    }

//    Method to override creation of new objects using clone in single ton design pattern
    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
    public static DriverClone getInstance()
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
