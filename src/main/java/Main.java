import models.Home;
import models.Room;
import models.iot.smartCamera.Camera;
import models.iot.smartSwitch.Switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private enum MenuType {
        main,
        rooms
    }

    private static final String EXIT = "0";
    private static final String LIST_ROOMS = "1";
    private static final String LIST_CTRLS = "2";
    private static final String ADD_ROOM = "3";

    private static final String RETURN = "2";
    private static final String ADD_CTRL = "1";

    private static MenuType menuType;

    public static void main(String[] args) throws IOException {
        Home home = Home.getInstance("10 Downing Street");

        Room kitchen = new Room("Kitchen");
        home.addRoom(kitchen);
        home.addControllerToRoom(kitchen.getId(), new Camera());
        home.addControllerToRoom(kitchen.getId(), new Switch());

        Room livingRoom = new Room("LivingRoom");
        home.addRoom(livingRoom);
        home.addControllerToRoom(livingRoom.getId(), new Switch());
        home.addControllerToRoom(livingRoom.getId(), new Camera());
        home.addControllerToRoom(livingRoom.getId(), new Switch());
        home.addControllerToRoom(livingRoom.getId(), new Switch());

        home.printControllers();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = "";
//        menuType = MenuType.main;
//
//        do {
//            if (menuType == MenuType.main) {
//                input = mainMenu(home, br);
//            } else if (menuType == MenuType.rooms) {
//                input = roomsMenu(home, br);
//            }
//        } while (!input.equals(EXIT));
    }

    private static String roomsMenu(Home home, BufferedReader br) throws IOException {
        System.out.println(ADD_CTRL + ". Add controller");
        System.out.println(RETURN + ". return..");

        String input = br.readLine();

        if (input.equals(ADD_CTRL)) {
            System.out.print("Select a room: ");
            input = br.readLine();
        } else if (input.equals(RETURN)) {
            menuType = MenuType.main;
        }

        return input;
    }

    private static String mainMenu(Home home, BufferedReader br) throws IOException {
        System.out.println(home);
        System.out.println(LIST_ROOMS + ". List rooms");
        System.out.println(LIST_CTRLS + ". List controllers");
        System.out.println(ADD_ROOM + ". Add room");
        System.out.println(EXIT + ". Exit");

        String input = br.readLine();

        if (input.equals(LIST_ROOMS)) {
            home.printRooms();
            menuType = MenuType.rooms;
        } else if (input.equals(LIST_CTRLS)) {
            home.printControllers();
        } else if (input.equals(ADD_ROOM)) {
            System.out.println("Enter room name:");
            home.addRoom(new Room(br.readLine()));
        }


        return input;
    }

    private static void clearConsole() {
        System.out.println("\u001b[2J");
        System.out.flush();
    }
}
