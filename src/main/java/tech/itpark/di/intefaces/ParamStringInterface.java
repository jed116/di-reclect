package tech.itpark.di.intefaces;

public interface ParamStringInterface {
//    public String getRepoPrivateParamStringValue() throws NoSuchFieldException, IllegalAccessException;
    default String getParamString() throws NoSuchFieldException, IllegalAccessException
    {
        return "N/A";
    };
}
