package models.iot;

import models.controller.Controller;

/** Controller  leaf" */
public abstract class IOT implements Controller {
    protected boolean isValid = true;
    protected IOTStatus status;

    public void setIsValid(boolean isValid){
        this.isValid = isValid;
    }

    public boolean getIsValid(){
        return this.isValid;
    }

    public IOTStatus getStatus(){
        return this.status;
    }
}