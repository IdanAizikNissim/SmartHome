package models.controller;

import models.Room;

import java.util.UUID;

public class RoomController<T extends IController> implements IController {
    private Room room;
    private T controller;

    public Room getRoom() {
        return room;
    }

    public T getController() {
        return controller;
    }

    public RoomController(Room room, T controller) {
        this.room = room;
        this.controller = controller;
    }

    public UUID getId() {
        return controller.getId();
    }
}
