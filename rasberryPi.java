/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

public class rasberryPi extends Computer implements Wifi, Radio {
public int numSocket;
    public rasberryPi(String ipAddress, int cpuClock, int memory, int storage, int numSocket){
        super(ipAddress, cpuClock, memory, storage);
        this.numSocket = numSocket;
    }
    @Override
    public void getInfo() {
        System.out.println("IP Address       : "+super.ipAddress);
        System.out.println("CPU Clock        : "+super.cpuClock);
        System.out.println("Memory           : "+super.memory);
        System.out.println("Storage          : "+super.storage);
        System.out.println("Battery Capacity : "+this.numSocket);
    }
    @Override
    public void sendData() {
        System.out.println("Rassberiip sedang mengirim data menggunakan wifi");
    }
    @Override
    public void sendSignal() {
        System.out.println("RaspberryPi sedang mengirim sinyal menggunakan Radio");
    }


    
}
