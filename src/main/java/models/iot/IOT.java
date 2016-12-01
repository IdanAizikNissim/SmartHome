package models.iot;

import models.controller.Controller;

/**
 * IController  leaf"
 */
public abstract class IOT extends Controller {
    protected boolean isValid;
    protected IOTStatus status;

    public boolean isValid() {
        return isValid;
    }

    public IOTStatus getStatus() {
        return status;
    }
}
