package jti.polinema.kuis2.praktikum;
/**
 * Nama      : Rofika Nur 'Aini
 * NIM       : 2041720099
 * No. Absen : 24
 * Kelas     : 2B
 **/
public abstract class Computer {
    public String ipAddress;
    public int cpuClock;
    public int memory;
    public int storage;
    
    public Computer(){}
    public Computer(String ipAddress, int cpuClock, int memory, int storage){
        this.ipAddress = ipAddress;
        this.cpuClock = cpuClock;
        this.memory = memory;
        this.storage = storage;
    }
    public abstract void getInfo();
}
