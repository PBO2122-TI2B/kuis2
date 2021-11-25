package kuis2;

public class Desktop extends Computer implements IWifi{
    public int battCapacity;

    public Desktop(String ipAddress, int cpuClock, int memory, int storage){
        super.ipAddress = ipAddress;
        super.cpuClock = cpuClock;
        super.memory = memory;
        super.storage = storage;
    }

    public void sendData(){
        System.out.println("Mengirim data Desktop menggunakan WIFI...");
    }

    public void getInfo(){
        System.out.println("\n\t===DESKTOP===");
        System.out.println("IP Address\t: " +this.ipAddress);
        System.out.println("CPU Clock\t: " +this.cpuClock+ " GHz");
        System.out.println("Memory\t\t: " +this.memory+ " GB");
        System.out.println("Storage\t\t: " +this.storage+ " GB");
        System.out.println("-------------------------------------- ");
    }
}
