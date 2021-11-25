public class Drone implements Wifi, Radio{
    public int maxSpeed;
    public int maxAltitude;

    Drone(int maxSpeed, int maxAltitude){
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
    }
    @Override
    public void sendData() {
        System.out.println("-- Informasi Drone --");
        System.out.println("Maximum Speed    : " + maxSpeed + " mph");
        System.out.println("Maximum Altitude : " + maxAltitude + " ft");
        System.out.println("Sedang mengontrol Drone via WIFI....");
    }

    @Override
    public void sendSignal() {
        System.out.println("-- Informasi Drone --");
        System.out.println("Maximum Speed    : " + maxSpeed + " mph");
        System.out.println("Maximum Altitude : " + maxAltitude + " ft");
        System.out.println("Sedang mengontrol Drone via Radio....");
    }
}
