package SingletonBreakageReflectionMethod;

public class MyCloneReflection implements Cloneable{
    @Override
    protected Object clone()
            throws CloneNotSupportedException {
        return super.clone();
    }
}
