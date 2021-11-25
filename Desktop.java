/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author acer
 */
public class Desktop extends Computer implements IWifi {
    public int battCapacity;

    @Override
    public void getInfo() {
        System.out.println("Ip Address      : "+ipAddress);
        System.out.println("CPU Clock       : "+cpuClock);
        System.out.println("Memory          : "+memory+" GB");
        System.out.println("Storage         : "+storage+" GB");
        System.out.println("Battry Capacity : "+battCapacity+" mAh");
    }

    @Override
    public void sendData() {
        System.out.println("Desktop Mengirimkan Data");
    }
        
}
