package models;

import models.controller.CompositeController;
import models.controller.IController;

/**
 * Created by hackeru on 01/12/2016.
 */
public class Home {
    private static Home instance;
    private CompositeController HAL;

    public static Home getInstance() {
        if (instance == null) {
            instance = new Home();
        }

        return instance;
    }

    private Home() {
        HAL = new CompositeController();
    }

    public void addControllerToRoom(Room room, IController controller) {

    }
}
