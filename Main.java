public class Main {
    public static void main(String[] args) {

        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        DeviceCommandFactory factory = new ConcreteDeviceCommandFactory();


        Command turnOnLight = factory.createCommand("turnOnLight", light);
        Command increaseTemp = factory.createCommand("increaseTemperature", thermostat);
        Command playMusic = factory.createCommand("playMusic", musicPlayer, "Chill Hits");


        CentralHub hub = new CentralHub();

        hub.setCommand(turnOnLight);
        hub.pressButton();

        hub.setCommand(increaseTemp);
        hub.pressButton();

        hub.setCommand(playMusic);
        hub.pressButton();
    }
}
