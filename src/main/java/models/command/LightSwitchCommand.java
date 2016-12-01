package models.command;

import java.util.Observable;

/**
 * Created by hackeru on 01/12/2016.
 */
public class LightSwitchCommand extends Command {

    public int getDimmerValue() {
        return dimmerValue;
    }

    public void setDimmerValue(int dimmerValue) {

        if (dimmerValue > 100 || dimmerValue < 0 ){

            this.dimmerValue = 0;
        }else{
            this.dimmerValue = dimmerValue;
        }
    }

    private int dimmerValue;
}
