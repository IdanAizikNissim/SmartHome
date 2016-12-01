package models.iot.smartBoiler;

import models.iot.IOTStatus;

/**
 * Created by hackeru on 01/12/2016.
 */
public class BoilerStatus implements IOTStatus<Long> {
    private long timer;

    public Long getStatus() {
        return timer;
    }

    public void setStatus(Long timer) {
        this.timer = timer;
    }
}
