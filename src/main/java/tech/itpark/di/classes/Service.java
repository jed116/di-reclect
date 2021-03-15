package tech.itpark.di.classes;

import tech.itpark.di.intefaces.ServiceParamStringInterface;

public class Service implements ServiceParamStringInterface {
    private final Repository repo;
    private String paramString = "empty";

    public Service(Repository repo) {
        this.repo = repo;
    }

    public Service(Repository repo, String paramString) {
        this.repo = repo;
        this.paramString = paramString;
    }

}
