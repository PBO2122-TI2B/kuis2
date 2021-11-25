public abstract class Computer{
    public String ipAddress;
    public int cpuClock;
    public int memory;
    public int storage;

    Computer(String ip, int cpu, int memory, int storage){
        this.ipAddress = ip;
        this.cpuClock = cpu;
        this.memory = memory;
        this.storage = storage;
    }

    public void getInfo(){
        System.out.println("ipAddress   : " +ipAddress);
        System.out.println("cpuClock    : " +cpuClock + " mhz");
        System.out.println("Memory      : " +memory + " Gb");
        System.out.println("Storage     : " +storage + " Gb");
    }
}

//Adika Ahmad Hanif Nazhir