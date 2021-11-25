public class Dekstop extends Computer implements Wifi{
    private int battCapacity;

    public Dekstop(String ipAddress, int cpuClock, int memory, int storage, int battCapacity){
        super(ipAddress, cpuClock, memory, storage);
        this.battCapacity = battCapacity;
    }
    
    @Override
    public void getInfo(){
        System.out.println("ipAddress: "+ ipAddress);
        System.out.println("cpuClock: "+ cpuClock +" MHz");
        System.out.println("Memory: "+ memory +" GB");
        System.out.println("Storage: "+ storage +" GB");
        System.out.println("Battery Capicity: "+ battCapacity);
    }

    @Override 
    public void sendData(){
        System.out.println("Data Dekstop Telah Terkontrol Melalui WIFI");
    }
}
