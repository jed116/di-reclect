package tech.itpark.di.intefaces;

public interface RepositoryParamStringInterface extends ParamStringInterface{
    @Override
    default String getParamString() {
        return "Repo-N/A";
    }
}
