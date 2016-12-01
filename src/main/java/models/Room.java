package models;

import java.util.UUID;

public class Room {
    private UUID id;
    private String name;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Room(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }
}
