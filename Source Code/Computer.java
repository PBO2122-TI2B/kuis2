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

    public abstract void getInfo();
}