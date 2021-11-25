public class Desktop extends Computer implements Wifi {
    public int battCapacity;

    Desktop(String ipAddress, int cpuClock, int memory, int storage, int battCapacity) {
        super(ipAddress, cpuClock, memory, storage);
        this.battCapacity = battCapacity;
    }

    @Override
    public void getInfo() {
        System.out.println("-- Informasi Detail Komputer --");
        System.out.println("IpAddress        : " + ipAddress);
        System.out.println("CPU Clock        : " + cpuClock + " Ghz");
        System.out.println("Memory           : " + memory + " Gb");
        System.out.println("Storage          : " + storage + " Gb");
    }

    @Override
    public void sendData() {
        System.out.println("-- Informasi Desktop --");
        System.out.println("Battery Capacity : " + battCapacity + " mAh");
        System.out.println("Sedang mengontrol Desktop via WIFI....");
    }
}
