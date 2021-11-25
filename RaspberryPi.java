package jti.polinema.kuis2.praktikum;
/**
 * Nama      : Rofika Nur 'Aini
 * NIM       : 2041720099
 * No. Absen : 24
 * Kelas     : 2B
 **/
public class RaspberryPi extends Computer implements WiFi, Radio{
    public int numSocket;
    public double freq;
    
    public RaspberryPi(String ipAddress, int cpuClock, int memory, int storage, 
            int numSocket, double freq){
        super(ipAddress, cpuClock, memory, storage);
        this.numSocket = numSocket;
        this.freq = freq;
    }
    @Override
    public void getInfo() {
        System.out.println("RaspberryPi");
        System.out.println("IP Address    : "+this.ipAddress);
        System.out.println("CPU Clock     : "+this.cpuClock +" GHz");
        System.out.println("Memory        : "+this.memory +" GB");
        System.out.println("Storage       : "+this.storage+" GB");
        System.out.println("Num Socket    : "+this.numSocket);
    }

    @Override
    public void sendData() {
        System.out.println("Frequencies   : "+this.freq +" GHz");
    }

    @Override
    public void sendSignal() {
        System.out.println("This device uses radio signals");
    }
    
}
