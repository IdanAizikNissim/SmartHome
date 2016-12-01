package models.iot.smartCamera;

import models.iot.IOT;

/**
 * Created by hackeru on 01/12/2016.
 */
public class Camera extends IOT{

    public void Rotate(int degrees) {
        this.status.setStatus(degrees);
    }

    public Camera(){
        this.status = new CameraStatus();
    }
}
