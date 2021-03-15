package tech.itpark.di;

//import tech.itpark.di.container.Container;
//import tech.itpark.di.container.Definition;
//import tech.itpark.di.reader.JsonDefinitionReader;

import tech.itpark.container.Container;
import tech.itpark.container.Definition;
import tech.itpark.di.classes.Controller;
import tech.itpark.di.classes.Repository;
import tech.itpark.di.classes.Service;
import tech.itpark.di.intefaces.ControllerParamStringInterface;
import tech.itpark.di.intefaces.ParamStringInterface;
import tech.itpark.reader.JsonDefinitionReader;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args){

        final JsonDefinitionReader reader = new JsonDefinitionReader();
        final Container container = new Container();

        Definition[] definitions = reader.read(Paths.get("definitions.json"));

        container.register(definitions);
        container.wire();

        Controller objControllerbyIface = (Controller) container.getObjectByName(ControllerParamStringInterface.class.getName());
        if (objControllerbyIface.equals((Controller) container.getObjectByName(Controller.class.getName()))){
            System.out.println("Controller paramString: " + objControllerbyIface.getParamString());
        }

        Service objService = (Service) container.getObjectByName(Service.class.getName());
        System.out.println("Service paramString: " + objService.getParamString());

        Repository objRepository = (Repository) container.getObjectByName(Repository.class.getName());
        System.out.println("Repository paramString: " + objRepository.getParamString());


    }
}
