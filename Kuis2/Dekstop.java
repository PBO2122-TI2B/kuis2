package Kuis2;

public class Dekstop extends Computer implements Wifi{
    public int battCapacity;

    public Dekstop(String ipAddress, int cpuClock, int memory, int storage, int battCapacity){
        super(ipAddress, cpuClock, memory, storage);
        this.battCapacity = battCapacity;
    }

    @Override
    public void getInfo() {
        System.out.println("===========================================");
        System.out.println("Dekstop");
        System.out.println("IP Address       : "+this.ipAddress);
        System.out.println("CPU Clock        : "+this.cpuClock);
        System.out.println("Memory           : "+this.memory);
        System.out.println("Storage          : "+this.storage);
        System.out.println("Battery Capacity : "+this.battCapacity);
    }

    @Override
    public void sendData() {
        System.out.println("'Dekstop dikontrol dengan wifi.....'");
    }
}
