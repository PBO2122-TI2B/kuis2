package kuis;

public class Drone implements IWifi, IRadio{
    public int maxSpeed;
    public int maxAltitude;

    public Drone(int maxSpeed, int maxAltitude){
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
    }
    @Override
    public void sendSignal() {
        System.out.println("Drone berhasil terhubung....");
    }

    @Override
    public void sendData() {
        System.out.println("Data Drone berhasil dikirim via WIFI...");
    }
    public void info(){
        System.out.println("------------------DRONE----------------------");
        System.out.println("Max Speed\t\t: " + maxSpeed + " mph");
        System.out.println("Max Altitude\t\t: " + maxAltitude + " ft");
        System.out.println();
    }
}
