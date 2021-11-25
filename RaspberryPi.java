public class RaspberryPi extends Computer implements Radio, Wifi{
    private int numSocket;

    public RaspberryPi(String ipAddress, int cpuClock, int memory, int storage, int numSocket){
        super(ipAddress, cpuClock, memory, storage);
        this.numSocket = numSocket;
    }

    @Override
    public void getInfo(){
        System.out.println("ipAddress: "+ ipAddress);
        System.out.println("cpuClock: "+ cpuClock +" MHz");
        System.out.println("Memory: "+ memory +" GB");
        System.out.println("Storage: "+ storage +" GB");
        System.out.println("Number Socket: "+ numSocket +" A");
    }
    @Override 
    public void sendSignal(){
        System.out.println("Signal Raspberry PI Telah terkontrol Melalui Radio");
    }
    @Override 
    public void sendData(){
        System.out.println("Data Raspberry PI Telah Terkontrol Melalui WIFI");
    }
}
