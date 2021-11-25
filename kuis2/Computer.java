package abstractclass.kuis2;
public class Computer {
    public String ipAddres;
    public int cpuClock;
    public int memory;
    public int storage;
    public Computer(String ipAddres, int cpuClock, int memory, int storage){
        this.ipAddres=ipAddres;
        this.cpuClock=cpuClock;
        this.memory=memory;
        this.storage=storage;
    }
    public void getInfo(){
        System.out.println("Ip Addres : "+ipAddres);
        System.out.println("CPU Clock : "+cpuClock);
        System.out.println("Memory    : "+memory);
        System.out.println("Storage   : "+storage);
    }
}
