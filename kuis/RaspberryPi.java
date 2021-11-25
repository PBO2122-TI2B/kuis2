package kuis;

public class RaspberryPi extends Computer implements IWifi, IRadio{
    public int numSocket;

    public RaspberryPi(String ipAddress, int cpuClock, int memory, int storage, int numSocket) {
        super(ipAddress, cpuClock, memory, storage);
        this.numSocket = numSocket;
    }

    @Override
    public void sendSignal() {
        System.out.println("Raspberry terhubung...");
    }

    @Override
    public void sendData() {
        System.out.println("Data Raspberry berhasil dikirim via WIFI...");
    }

    @Override
    public void getInfo() {
        System.out.println("------------------RASPBERRY Pi----------------------");
        System.out.println("Ip Address\t\t: " + ipAddress);
        System.out.println("CPU Clock\t\t: " + cpuClock + " Ghz");
        System.out.println("Memory\t\t\t: " + memory + " GB RAM");
        System.out.println("Storage\t\t\t: " + storage + " GB");
        System.out.println("Number of Socket\t: " + numSocket);
        System.out.println();
    }
    
}
