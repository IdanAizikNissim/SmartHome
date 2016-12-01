package models.iot.smartSwitch;

import models.iot.IOTStatus;

/**
 * Created by hackeru on 01/12/2016.
 */
public class SwitchStatus implements IOTStatus<Integer> {
    private int dimmerPercent;

    public Integer getStatus() {
        return dimmerPercent;
    }

    public void setStatus(Integer dimmerPercent) {
        this.dimmerPercent = dimmerPercent;
    }
}
