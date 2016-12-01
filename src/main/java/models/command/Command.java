package models.command;

import java.util.Observable;
import java.util.Observer;
import java.util.UUID;

/**
 * Created by hackeru on 01/12/2016.
 */
public abstract class Command extends Observable implements ICommand {

    public void setControllerId(UUID controllerId) {
        this.controllerId = controllerId;
    }

    protected UUID controllerId;

    public UUID getControllerId() {
        return controllerId;
    }

    public void doCommand(){
        setChanged();
        notifyObservers(this);
    }
}
