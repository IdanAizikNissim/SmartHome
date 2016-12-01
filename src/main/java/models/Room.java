package models;

import models.controller.CompositeController;
import models.controller.IController;

import java.util.UUID;

public class Room {
    private UUID id;
    private String name;
    private CompositeController mainController;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CompositeController getMainController() {
        return mainController;
    }

    public Room(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.mainController = new CompositeController();
    }

    public void addController(IController controller) {
        mainController.add(controller);
    }
}
