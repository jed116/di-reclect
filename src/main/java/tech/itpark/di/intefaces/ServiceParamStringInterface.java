package tech.itpark.di.intefaces;

public interface ServiceParamStringInterface extends ParamStringInterface{
    @Override
    default String getParamString() {
        return "Srvc-N/A";
    }
}
