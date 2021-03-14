package tech.itpark.di;

import tech.itpark.di.intefaces.ParamStringInterface;

public class Service{
    private final Repository repo;
    private String paramString = "empty";

    public Service(Repository repo) {
        this.repo = repo;
    }

    public Service(Repository repo, String paramString) {
        this.repo = repo;
        this.paramString = paramString;
    }

//    @Override
    public String getParamString() throws NoSuchFieldException, IllegalAccessException {
        return paramString;
    }
}
