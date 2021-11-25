public class Drone implements WiFi, Radio {
    public int maxSpeed;
    public int maxAltitude;

    @Override
    public void sendSignal() {
        System.out.println("Drone is sending signal via Radio");
        
    }

    @Override
    public void sendData() {
        System.out.println("Drone is sending data via WiFi");
        
    }
    
}
