package kuis2;

public class RaspberryPi extends Computer implements IWifi,IRadio{
    public int numSocket;

    public RaspberryPi(String ipAddress, int cpuClock, int memory, int storage){
        super.ipAddress = ipAddress;
        super.cpuClock = cpuClock;
        super.memory = memory;
        super.storage = storage;
    }
    public void sendData(){
        System.out.println("Mengirim data RaspberryPi menggunakan WIFI...");
    }

    public void sendSignal(){
        System.out.println("Mengirim sinyal RaspberryPi...");
    }

    public void getInfo(){
        System.out.println("\n\t===RASPBERRY PI===");
        System.out.println("IP Address\t: " +this.ipAddress);
        System.out.println("CPU Clock\t: " +this.cpuClock+ " GHz");
        System.out.println("Memory\t\t: " +this.memory+ " GB");
        System.out.println("Storage\t\t: " +this.storage+ " GB");
        System.out.println("-------------------------------------- ");
    }
}
