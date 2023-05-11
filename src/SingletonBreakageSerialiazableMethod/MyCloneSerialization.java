package SingletonBreakageSerialiazableMethod;

public class MyCloneSerialization implements Cloneable{
    @Override
    protected Object clone()
            throws CloneNotSupportedException {
        return super.clone();
    }
}
