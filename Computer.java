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
public class Computer {
    public String ipAddress;
    public int cpuClock;
    public int memory;
    public int storage;

    public Computer(String ipAddress, int cpuClock, int memory, int storage){
        this.ipAddress = ipAddress;
        this.cpuClock = cpuClock;
        this.memory = memory;
        this.storage = storage;
    }
    
    public void getinfo(){
        System.out.println("IP Address : " + ipAddress);
        System.out.println("CPU Clock : " + cpuClock);
        System.out.println("Memory : " + memory);
        System.out.println("Storage : " + storage);

    }
}
