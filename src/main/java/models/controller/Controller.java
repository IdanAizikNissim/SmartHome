package models.controller;

import java.util.UUID;

/**
 * Created by hackeru on 01/12/2016.
 */
public abstract class Controller implements IController {
    private UUID id;

    public UUID getId() {
        return id;
    }

    public Controller() {
        id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return id.toString();
    }
}
