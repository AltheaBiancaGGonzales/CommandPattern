public class Light {
    public void turnOn() {
        System.out.println("Light is turned on");
    }

    public void turnOff() {
        System.out.println("Light is turned off");
    }

    public void setBrightness(int level) {
        System.out.println("Light brightness set to " + level);
    }
}

public class Thermostat {
    public void increaseTemperature() {
        System.out.println("Temperature increased");
    }

    public void decreaseTemperature() {
        System.out.println("Temperature decreased");
    }
}

public class MusicPlayer {
    public void playPlaylist(String playlist) {
        System.out.println("Playing playlist: " + playlist);
    }

    public void setVolume(int level) {
        System.out.println("Volume set to " + level);
    }
}

// Concrete Command Classes
public class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

public class TurnOffLightCommand implements Command {
    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

public class IncreaseTemperatureCommand implements Command {
    private Thermostat thermostat;

    public IncreaseTemperatureCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.increaseTemperature();
    }
}

public class PlayMusicCommand implements Command {
    private MusicPlayer musicPlayer;
    private String playlist;

    public PlayMusicCommand(MusicPlayer musicPlayer, String playlist) {
        this.musicPlayer = musicPlayer;
        this.playlist = playlist;
    }

    @Override
    public void execute() {
        musicPlayer.playPlaylist(playlist);
    }
}
