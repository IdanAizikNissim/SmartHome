package models.iot.smartCamera;

import models.iot.IOTStatus;

/**
 * Created by hackeru on 01/12/2016.
 */
public class CameraStatus implements IOTStatus<Integer> {
    private int degrees;

    public Integer getStatus() {
        return (360 + this.degrees) % 360;
    }

    public void setStatus(Integer degrees) {
        this.degrees += degrees;
    }
}
