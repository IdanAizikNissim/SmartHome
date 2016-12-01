package models.iot.smartBoiler;

import java.util.TimerTask;
import java.util.UUID;

/**
 * Created by hackeru on 01/12/2016.
 */
public class BoilerTimerTask extends TimerTask {

    private Boiler boiler;

    public BoilerTimerTask(Boiler boiler){
        this.boiler = boiler;
    }

    @Override
    public void run() {
        boiler.decreesTime();
    }
}
