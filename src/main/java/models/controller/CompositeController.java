package models.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CompositeController implements IController {
    private List<IController> childControllers;
    private static final int LIMIT = 4;
    private IController parent;

    public CompositeController() {
        childControllers = new ArrayList<IController>();
    }

    public boolean add(IController controller) {
        if (childControllers.size() > LIMIT) {
            return false;
        } else {
            childControllers.add(controller);

            if (controller instanceof CompositeController) {
                ((CompositeController)controller).parent = this;
            }

            return true;
        }
    }

    public void remove(IController controller) {
        childControllers.remove(controller);
    }

    public IController find(UUID id) {
        for (IController controller:childControllers) {
            if (controller instanceof CompositeController) {
                return ((CompositeController)controller).find(id);
            } else if (((Controller)controller).getId() == id) {
                return controller;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        for (IController child:childControllers) {
            string.append(getGap() + child.toString() + "\n");
        }

        return string.toString();
    }

    private String getGap() {
        int lvl = getLevel(parent);
        StringBuilder gap = new StringBuilder();

        for (int l = 0; l < lvl + 1; ++l) {
            gap.append("  ");
        }

        return gap.toString();
    }

    private int getLevel(IController p) {
        if (p == null) {
            return 0;
        }

        return getLevel(((CompositeController)p).parent) + 1;
    }
}