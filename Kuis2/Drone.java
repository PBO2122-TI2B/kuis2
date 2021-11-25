package Kuis2;

public class Drone implements Wifi, Radio{
    public int maxSpeed, maxAltitude;

    public Drone(int maxSpeed, int maxAltitude){
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void sendData() {
        System.out.println("'Drone dikontrol dengan wifi.....'");
    }

    @Override
    public void sendSignal() {
        System.out.println("'Radio mengirim sinyal ke Drone.....'");
    }
    public void displayData(){
        System.out.println("===========================================");
        System.out.println("Drone");
        System.out.println("Max Speed       : "+this.maxSpeed + " mph");
        System.out.println("Max Altitude    : "+this.maxAltitude + " m");
    }
}
