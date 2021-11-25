package kuis2;

public abstract class Computer {
    public String ipAddress;
    public int cpuClock;
    public int memory;
    public int storage;

    public void getInfo() {
        System.out.println("IP Address: " + this.ipAddress);
        System.out.println("CPU Clock : " + this.cpuClock);
        System.out.println("Memory    : " + this.memory);
        System.out.println("Storage   : " + this.storage);
    }
}
