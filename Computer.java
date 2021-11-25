abstract class Computer {
    protected String ipAddress;
    protected int cpuClock;
    protected int memory;
    protected int storage;

    public void getInfo(String ipAddress,int cpuClock,int memory,int storage) {
        this.ipAddress=ipAddress;
        this.cpuClock=cpuClock;
        this.memory=memory;
        this.storage=storage;
        System.out.println("Spesifikasi Computer");
        System.out.println("IP Address : " + ipAddress);
        System.out.println("CPU Clock Speed : " + cpuClock + "GHz");
        System.out.println("Memory Size : " + memory + "GB");
        System.out.println("Storage Size : " + storage + "GB");
    }
}