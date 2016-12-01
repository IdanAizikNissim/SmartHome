package models.command;


import java.util.Observable;
import java.util.UUID;

/**
 * Created by hackeru on 01/12/2016.
 */
public class BoilerCommand extends Command {

    public int getTime() {
        return time;
    }

    public void setTime(int time) {

        if (time < 0){
            this.time = 0;

        }else{
            this.time = time;
        }
    }

    private int time;
}
