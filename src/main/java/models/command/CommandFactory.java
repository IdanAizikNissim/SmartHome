package models.command;

/**
 * Created by hackeru on 01/12/2016.
 */
public class CommandFactory {

    public static Command createImageReader(CommandType cmd) {
        if (cmd == CommandType.boilerCommand) {
            return new BoilerCommand();

        }if (cmd == CommandType.lightSwitchCommand) {
            return new LightSwitchCommand();

        }if (cmd == CommandType.cameraCommand) {
            return new CameraCommand();

        } else {
            throw new IllegalArgumentException("Unknown command type.");
        }
    }


    public enum CommandType {
        boilerCommand,
        lightSwitchCommand,
        cameraCommand
    }
}