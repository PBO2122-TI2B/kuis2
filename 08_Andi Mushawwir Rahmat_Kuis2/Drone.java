public class Drone implements Wifi, Radio{
    public int maxSpeed;
    public int maxAltitude;

    public void sendData(){
        System.out.println("=============================");
        System.out.println("Controlling Drone via Wifi ");
    }

    public void sendSignal() {
        System.out.println("=============================");
        System.out.println("Controlling Drone via Radio ");
        System.out.println("=============================");
    }
}
