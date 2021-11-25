package kuis2;

public class RaspberryPi extends Computer implements IWiFi, IRadio {
    public int numSocket;

    public void sendData() {
        System.out.println("Number Socket: " + this.numSocket);
        System.out.println("This RaspberryPi is connected to the WiFi (10101010)");
    }

    public void sendSignal() {
        System.out.println("Number Socket: " + this.numSocket);
        System.out.println("This RaspberryPi is connected to the Radio (10101111)");
    }
}
