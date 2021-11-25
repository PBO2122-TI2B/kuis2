public abstract class Computer{
    protected String ipAddress;
    protected int cpuClock;
    protected int memory;
    protected int storage;

    public Computer(String ipAddress, int cpuClock, int memory, int storage){
        this.ipAddress = ipAddress;
        this.cpuClock = cpuClock;
        this.memory = memory;
        this.storage = storage;
    }
    
    public void setIpAddress(String ipAddress){
        this.ipAddress = ipAddress;
    }
    public String getIpAddress(){
        return ipAddress;
    }
    public void setCpuClock(int cpuClock){
        this.cpuClock = cpuClock;
    }
    public int getCpuClock(){
        return cpuClock;
    }
    public void setMemory(int memory){
        this.memory = memory;
    }
    public int getMemory(){
        return memory;
    }
    public void setStorage(int storage){
        this.storage = storage;
    }
    public int getStorage(){
        return storage;
    }
    public abstract void getInfo();
}