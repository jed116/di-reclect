package tech.itpark.di;

import tech.itpark.di.intefaces.ParamStringInterface;

public class Controller implements ParamStringInterface {
    private final Service srvc;

    public Controller(Service srvc) {
        this.srvc = srvc;
    }
}
