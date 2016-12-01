package models.iot.smartBoiler;

import models.iot.IOT;

import java.util.Timer;
import java.util.UUID;

/**
 * Created by hackeru on 01/12/2016.
 */
public class Boiler extends IOT {

    public void startTimer(int time) {
        this.status.setStatus(time);
        new Timer().schedule(new BoilerTimerTask(getId()), 0, time * 1000);
    }

    public Boiler() {
        this.status = new BoilerStatus();
    }
}
