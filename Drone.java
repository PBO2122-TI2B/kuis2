package Kuis2;

public class Drone implements IRadio, IWifi{
    public int maxSpeed;
    public int maxAltitude;

    public void sendData(){
        System.out.println("        Data Drone");
        System.out.println("Maximum speed       : " + maxSpeed + "Mph");
        System.out.println("Maximum Altitude    : " + maxAltitude + "ft");
    }

    public void sendSignal(){
        System.out.println("        Sinyal Drone");
        System.out.println("Maximum speed       : " + maxSpeed + "Mph");
        System.out.println("Maximum Altitude    : " + maxAltitude + "ft");
    }
}
