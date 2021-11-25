public class Drone extends Computer implements Radio, Wifi{
    private int maxSpeed;
    private int maxAltitude;

    public Drone(String ipAddress, int cpuClock, int memory, int storage, int maxSpeed, int maxAltitude){
        super(ipAddress, cpuClock, memory, storage);
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
    }
    
    @Override
    public void getInfo(){
        System.out.println("ipAddress: "+ ipAddress);
        System.out.println("cpuClock: "+ cpuClock +" MHz");
        System.out.println("Memory: "+ memory +" GB");
        System.out.println("Storage: "+ storage +" GB");
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

