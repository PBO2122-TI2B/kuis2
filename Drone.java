public class Drone implements Wifi, Radio {
    public int maxSpeed;
    public int maxAltitude;
    
    public void sendData(){
        System.out.println("Drone via Wifi");
    
    }
    public void sendSignal() {
        System.out.println("Drone Via Radio");
    }
}
