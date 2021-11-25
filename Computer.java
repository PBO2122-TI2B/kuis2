public abstract class Computer{
    protected String ipAddress = "192.168.72";
    protected int cpuClock = 5;
    protected int memory = 8;
    protected int storage = 512;

    public void getInfo(){
        System.out.println("ipAddress:"+ ipAddress);
        System.out.println("cpuClock:"+ cpuClock);
        System.out.println("Memory:"+ memory);
        System.out.println("Storage:"+storage);
    }
}
