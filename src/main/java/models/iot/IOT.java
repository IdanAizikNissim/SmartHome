package models.iot;

import models.controller.Controller;

/** IController  leaf" */
public abstract class IOT extends Controller {
    protected IOTStatus status;
    protected boolean isValid;
}
