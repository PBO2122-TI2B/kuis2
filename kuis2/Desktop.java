package kuis2;

public class Desktop extends Computer implements IWiFi {
    public int battCapacity;

    public void sendData() {
        System.out.println("Battery Capacity: " + this.battCapacity);
        System.out.println("This Desktop is connected to the WiFi (10101010)");
    }
}
