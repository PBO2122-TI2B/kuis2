public class Drone implements Radio, Wifi{
    private int maxSpeed;
    private int maxAltitude;

    public Drone(int maxSpeed, int maxAltitude){
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
    }
    
    public void getInfo2(){
        System.out.println("Max Speed: "+ maxSpeed +" fps");
        System.out.println("Max Altitude: "+ maxAltitude +" meter");
    }
    
    @Override 
    public void sendSignal(){
        System.out.println("Signal Drone Telah terkontrol Melalui Radio");
    }
    @Override 
    public void sendData(){
        System.out.println("Data Drone Telah Terkontrol Melalui WIFI");
    }
}

