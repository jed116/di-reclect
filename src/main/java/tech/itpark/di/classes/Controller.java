package tech.itpark.di.classes;

import tech.itpark.di.intefaces.ControllerParamStringInterface;

public class Controller implements ControllerParamStringInterface {
    private final Service srvc;

    public Controller(Service srvc) {
        this.srvc = srvc;
    }
}
