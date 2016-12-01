package models.iot.smartSwitch;


import models.iot.IOT;
import models.iot.IOTStatus;

/**
 * Created by hackeru on 01/12/2016.
 */
public class Switch extends IOT {

    public void setDimPercent(int percent) {
        this.status.setStatus(percent);
    }

    public void turnOn() {
        this.status.setStatus(100);
    }

    public void turnOff() {
        this.status.setStatus(0);
    }


    public Switch() {
        this.status = new SwitchStatus();
    }
}
