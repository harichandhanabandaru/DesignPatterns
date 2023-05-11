package SingletonBreakageReflectionMethod;

public class DriverReflection extends MyCloneReflection {


    private int tableCount=0;
    static DriverReflection driver;

    static {
        try {
            driver = new DriverReflection("Drive");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private String schemaName;
    private DriverReflection(String schemaName) throws IllegalAccessException {
        this.schemaName=schemaName;
//        Method to override Reflection single ton break down method
        if(driver != null)
        {
            throw new IllegalAccessException("New object cannot be created ");
        }
    }

//    Method to override creation of new objects using clone in single ton design pattern
    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
    public static DriverReflection getInstance()
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
