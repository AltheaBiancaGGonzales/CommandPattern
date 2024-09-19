
public abstract class DeviceCommandFactory {
    public abstract Command createCommand(String action, Object... params);
}

public class ConcreteDeviceCommandFactory extends DeviceCommandFactory {
    @Override
    public Command createCommand(String action, Object... params) {
        switch (action) {
            case "turnOnLight":
                return new TurnOnLightCommand((Light) params[0]);
            case "turnOffLight":
                return new TurnOffLightCommand((Light) params[0]);
            case "increaseTemperature":
                return new IncreaseTemperatureCommand((Thermostat) params[0]);
            case "playMusic":
                return new PlayMusicCommand((MusicPlayer) params[0], (String) params[1]);
            default:
                throw new IllegalArgumentException("Unknown action");
        }
    }
}
