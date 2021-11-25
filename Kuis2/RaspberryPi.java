package Kuis2;

public class RaspberryPi extends Computer implements Wifi, Radio{
    public int numSocket;

    public RaspberryPi(String ipAddress, int cpuClock, int memory, int storage, int numSocket){
        super(ipAddress, cpuClock, memory, storage);
        this.numSocket = numSocket;
    }

    @Override
    public void getInfo() {
        System.out.println("===========================================");
        System.out.println("Raspberry Pi");
        System.out.println("IP Address      : "+this.ipAddress);
        System.out.println("CPU Clock       : "+this.cpuClock);
        System.out.println("Memory          : "+this.memory);
        System.out.println("Storage         : "+this.storage);
        System.out.println("Num Socket      : "+this.numSocket);
    }

    @Override
    public void sendData() {
        System.out.println("'Raspberry Pi dikontrol dengan wifi.....'");
    }

    @Override
    public void sendSignal() {
        System.out.println("'Radio mengirim sinyal ke Raspberry Pi.....'");
    }
}
