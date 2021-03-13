package tech.itpark.di;

import tech.itpark.di.container.Container;
import tech.itpark.di.container.Definition;
import tech.itpark.di.reader.JsonDefinitionReader;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        final JsonDefinitionReader reader = new JsonDefinitionReader();
        final Container container = new Container();

        Definition[] definitions = reader.read(Paths.get("definitions.json"));

        container.register(definitions);
        container.wire(3);


        Controller objController = (Controller) container.getObjectByName(Controller.class.getName());
        System.out.println("Controller paramString: " + objController.getParamString());

        Service objService = (Service) container.getObjectByName(Service.class.getName());
        System.out.println("Service paramString: " + objService.getParamString());

        Repository objRepository = (Repository) container.getObjectByName(Repository.class.getName());
        System.out.println("Repository paramString: " + objRepository.getParamString());

    }
}
