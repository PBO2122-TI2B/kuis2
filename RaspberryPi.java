/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author LENOVO
 */
public class RaspberryPi extends Computer implements WiFi, Radio {
    public int numSocket;
    
    public RaspberryPi(String ipAddress, int cpuClock, int memory, int storage, int numSocket){
        super(ipAddress, cpuClock, memory, storage);
        this.numSocket = numSocket;
    }

    RaspberryPi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sendData() {
        System.out.println("Raspberry Pi mengirim data menggunakan WiFi");
    }

    @Override
    public void sendSignal() {
        System.out.println("Raspberry Pi mengirim sinyal lewat Radio");
    }

    @Override
    public void getinfo(){
        System.out.println("IP Address : " + ipAddress);
        System.out.println("CPU Clock : " + cpuClock);
        System.out.println("Memory : " + memory);
        System.out.println("Storage : " + storage);
        System.out.println("Number Socket : " + numSocket);
    }
}
