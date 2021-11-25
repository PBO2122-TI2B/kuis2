public class Drone implements Wifi, Radio {
    public int maxSpeed;
    public int maxAltitude;

    public void sendData() {
        System.out.println("Drone dikontrol dengan Wifi");
        System.out.println("-----------------------------");
    }

    public void sendSignal() {
        System.out.println("Drone dikontrol dengan Radio");
        System.out.println("-----------------------------");
    }

    public void getData(int maxSpeed, int maxAltitude){
        this.maxSpeed=maxSpeed;
        this.maxAltitude=maxAltitude;
        System.out.println("Maximum Speed : " + maxSpeed + "km/h");
        System.out.println("Maximum Altitude : " + maxAltitude + "m");
    }
}