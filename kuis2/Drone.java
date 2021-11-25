package kuis2;

public class Drone implements IWiFi, IRadio {
    public int maxSpeed;
    public int maxAltitude;

    public void sendData() {
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Max Altitude: " + this.maxAltitude);
        System.out.println("This Drone is connected to the WiFi (10101010)");
    }

    public void sendSignal() {
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Max Altitude: " + this.maxAltitude);
        System.out.println("This Drone is connected to the Radio (10101111)");
    }
}
