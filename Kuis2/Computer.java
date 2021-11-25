package Kuis2;

public abstract class Computer {
    public String ipAddress;
    public int cpuClock, memory, storage;

    public Computer(String ipAddress, int cpuClock, int memory, int storage){
        this.ipAddress = ipAddress;
        this.cpuClock = cpuClock;
        this.memory = memory;
        this.storage = storage;
    }
    public abstract void getInfo();
}
