package models.iot.smartBoiler;

import java.util.TimerTask;
import java.util.UUID;

/**
 * Created by hackeru on 01/12/2016.
 */
public class BoilerTimerTask extends TimerTask {

    private UUID boilerId;

    public BoilerTimerTask(UUID id){
        boilerId = id;
    }

    @Override
    public void run() {
    }
}
