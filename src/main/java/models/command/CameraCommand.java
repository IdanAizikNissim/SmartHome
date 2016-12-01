package models.command;

import java.util.Observable;

/**
 * Created by hackeru on 01/12/2016.
 */
public class CameraCommand extends Command {

    public int getSpin() {
        return spin;
    }

    public void setSpin(int spin) {
        this.spin = spin;
    }

    private int spin;
}