package kuis;

public class Desktop extends Computer implements IWifi{
    public int battCapacity;

    public Desktop(String ipAddress, int cpuClock, int memory, int storage, int battCapacity) {
        super(ipAddress, cpuClock, memory, storage);
        this.battCapacity = battCapacity;
    }

    @Override
    public void sendData() {
        System.out.println("Data Desktop berhasil dikirim via WIFI...");
    }

    @Override
    public void getInfo() {
        System.out.println("------------------DESKTOP----------------------");
        System.out.println("Ip Address\t\t: " + ipAddress);
        System.out.println("CPU Clock\t\t: " + cpuClock + " Ghz");
        System.out.println("Memory\t\t\t: " + memory + " GB RAM");
        System.out.println("Storage\t\t\t: " + storage + " GB");
        System.out.println("Battery Capacity\t: " + battCapacity + " mAh");
        System.out.println();
    }
    
}
