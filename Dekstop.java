package jti.polinema.kuis2.praktikum;
/**
 * Nama      : Rofika Nur 'Aini
 * NIM       : 2041720099
 * No. Absen : 24
 * Kelas     : 2B
 **/
public class Dekstop extends Computer implements WiFi{
    public int battCapacity;
    public double freq;
    
    public Dekstop(String ipAddress, int cpuClock, int memory, int storage, 
            int battCapacity, double freq){
        super(ipAddress, cpuClock, memory, storage);
        this.battCapacity = battCapacity;
        this.freq = freq;
    }
    @Override
    public void getInfo() {
        System.out.println("Dekstop");
        System.out.println("IP Address    : "+this.ipAddress);
        System.out.println("CPU Clock     : "+this.cpuClock +" GHz");
        System.out.println("Memory        : "+this.memory +" GB");
        System.out.println("Storage       : "+this.storage+" GB");
        System.out.println("Batt Capacity : "+this.battCapacity+" mAh");
    }

    @Override
    public void sendData() {
        System.out.println("Frequencies   : "+this.freq +" GHz");
    }
    
}
