package models.controller;

import models.Room;

public class RoomController<T extends Controller> implements Controller {
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
}
