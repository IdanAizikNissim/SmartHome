package models.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CompositeController implements IController {
    private List<IController> childControllers;
    private static final int LIMIT = 4;

    public CompositeController() {
        childControllers = new ArrayList<IController>();
    }

    public boolean add(IController controller) {
        if (childControllers.size() > LIMIT) {
            return false;
        } else {
            childControllers.add(controller);
            return true;
        }
    }

    public void remove(IController controller) {
        childControllers.remove(controller);
    }

    public UUID getId() {
        return this.getId();
    }
}