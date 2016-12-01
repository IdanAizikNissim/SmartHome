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
        new Timer(true).scheduleAtFixedRate(new BoilerTimerTask(this), 0, time * 1000);
    }

    protected void decreesTime() {
        this.status.setStatus(((BoilerStatus)this.status.getStatus()).timer--);
    }

    public Boiler() {
        this.status = new BoilerStatus();
    }
}
