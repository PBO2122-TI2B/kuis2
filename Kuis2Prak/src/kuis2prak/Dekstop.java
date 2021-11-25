/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2prak;

/**
 *
 * @author SMK TELKOM
 */
public class Dekstop extends Computer implements Wifi{
    public int battCapacity ;

    public Dekstop(int battCapacity, String ipAddress, int cpuClock, int memory, int storage) {
        super(ipAddress, cpuClock, memory, storage);
        this.battCapacity = battCapacity;
    }

    @Override
    public void getInfo() {
        System.out.println("IP ADDRESS      : " + super.ipAddress);
        System.out.println("CPU CLOCK       : " + super.cpuClock);
        System.out.println("MEMORY          : " + super.memory);
        System.out.println("STORAGE         : " + super.storage);
        System.out.println("BATTERY CAPACITY: " + this.battCapacity);
    }

    @Override
    public void sendData() {
        System.out.println("DATA SENDED!!");
    }
}

