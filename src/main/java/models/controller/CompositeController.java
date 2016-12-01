package models.controller;

import java.util.List;
import java.util.UUID;

public class CompositeController implements Controller {
    private UUID id;
    private List<Controller> childControllers;

    public CompositeController() {
        this.id = UUID.randomUUID();
    }
}