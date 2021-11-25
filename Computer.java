/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2pbo;

/**
 *
 * @author Asus X453
 */
public class Computer {
    public String ipAddress;
    public int cpuClock,memory, storage;

    public void getinfo(){
        System.out.println("IP Adress : " + ipAddress);
        System.out.println("CPU Clock : " + cpuClock);
        System.out.println("Memory : " + memory);
        System.out.println("Storage : " + storage);
        
    }
}
