package models.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CompositeController implements Controller {
    private List<Controller> childControllers;
    private static final int LIMIT = 4;

    public CompositeController() {
        childControllers = new ArrayList<Controller>();
    }

    public boolean add(Controller controller) {
        if (childControllers.size() > LIMIT) {
            return false;
        } else {
            childControllers.add(controller);
            return true;
        }
    }

    public void remove(Controller controller) {
        childControllers.remove(controller);
    }

    public UUID getId() {
        return this.getId();
    }
}