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
public class Desktop extends Computer implements WiFi {
    private int battCapacity;
    
    public Desktop(String ipAddress, int cpuClock, int memory, int storage, int battCapacity){
        super(ipAddress, cpuClock, memory, storage);
        this.battCapacity=battCapacity;
    }
    @Override
    public void sendData(){
    }

    @Override
    public void getInfo() {
        System.out.println("Desktop");
        System.out.println("IP Address       = "+super.ipAddress);
        System.out.println("CPU Clock        = "+super.cpuClock+"GHz");
        System.out.println("Memory           = "+super.memory+" GB RAM");
        System.out.println("Storage          = "+super.storage+" GB");
        System.out.println("Kapasitas Batrai = "+this.battCapacity+"mAh");
    }
}
