public class Drone implements IWiFi,IRadio{
    public int maxSpeed;
    public int maxAltitude;

    @Override
    public void sendSignal() {
        System.out.println("Drone Mengirim Sinyal Radio");
        
    }
    @Override
    public void sendData() {
        System.out.println("Drone Mengirim Data menggunakan WiFi");
        
    }
}

//Adika Ahmad Hanif Nazhir