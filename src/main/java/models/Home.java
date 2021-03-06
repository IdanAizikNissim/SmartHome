package models;

import models.controller.CompositeController;
import models.controller.IController;

import java.util.*;

/**
 * Created by hackeru on 01/12/2016.
 */
public class Home implements Observer {
    private static Home instance;
    private String address;
    private List<Room> rooms;
    private CompositeController HAL;

    public static Home getInstance(String address) {
        Home home = getInstance();
        home.address = address;

        return home;
    }

    public static Home getInstance() {
        if (instance == null) {
            instance = new Home();
        }

        return instance;
    }

    private Home() {
        HAL = new CompositeController();
        rooms = new ArrayList<Room>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
        HAL.add(room.getMainController());
    }

    public void addControllerToRoom(UUID roomId, IController controller) {
        Room room = getRoomById(roomId);

        if (room == null) {
            return;
        } else {
            room.addController(controller);
        }
    }

    private Room getRoomById(UUID id) {
        for (Room room:rooms) {
            if (room.getId() == id) {
                return room;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Home: " + address + "\n========================";
    }

    public void printRooms() {
        StringBuilder string = new StringBuilder();

        for (Room room:rooms) {
            string.append(room + "\n");
        }

        System.out.println(string);
    }

    public void update(Observable o, Object arg) {

    }

    public void printControllers() {
        System.out.println(this);
        System.out.println(HAL);
    }
}
