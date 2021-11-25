public abstract class Computer {
    protected String ipAddress;
    protected int cpuClock;
    protected int memory;
    protected int storage;

    public Computer (String ipAddress, int cpuClock, int memory, int storage) {
        this.ipAddress = ipAddress;
        this.cpuClock = cpuClock;
        this.memory = memory;
        this.storage = storage;
    }

    public void getInfo() {
        System.out.println("-- Informasi Detail Komputer --");
        System.out.println("IpAddress        : " + ipAddress);
        System.out.println("CPU Clock        : " + cpuClock + " Ghz");
        System.out.println("Memory           : " + memory + " Gb");
        System.out.println("Storage          : " + storage + " Gb");
    }
}