package kuis2;

public class Drone implements IWifi,IRadio{
    public int maxSpeed;
    public int maxAltitude;

    public Drone(int maxSpeed, int maxAltitude){
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
    }
    public void sendData(){
        System.out.println("Mengirim data Drone menggunakan WIFI...");
    }

    public void sendSignal(){
        System.out.println("Mengirim sinyal Drone...");
    }

    public void info(){
        System.out.println("\n\t===DRONE===");
        System.out.println("Max Speed\t: " +this.maxSpeed+ "km/jam");
        System.out.println("Max Altitude\t: " +this.maxAltitude+ " kaki");
        System.out.println("-------------------------------------- ");
    }
}
