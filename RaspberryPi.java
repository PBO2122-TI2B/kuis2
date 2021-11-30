/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_PraktikumKUIS2;

/**
 *
 * @author Chaidir Wiradhika
 */
public class RaspberryPi extends Computer implements WiFi, Radio {
    private int numSocket;
    
    public RaspberryPi(String ipAddress, int cpuClock, int memory, int storage, int numSocket){
        super(ipAddress, cpuClock, memory, storage);
        this.numSocket=numSocket;
    }
    @Override
    public void sendData(){
    }
    @Override
    public void sendSignal(){
    }

    @Override
    public void getInfo() {
        System.out.println("RaspberryPi");
        System.out.println("IP Address       = "+super.ipAddress);
        System.out.println("CPU Clock        = "+super.cpuClock+"MHz");
        System.out.println("Memory           = "+super.memory+" GB RAM");
        System.out.println("Storage          = "+super.storage+" GB");
        System.out.println("numSocket        = RPI-"+this.numSocket);
    }
}
