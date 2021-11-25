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
public class Desktop extends Computer implements WiFi {
    public int battCapacity;

    

    @Override
    public void sendData() {
       System.out.println("Desktop mengirim data menggunakan WiFi");
    }
    
    @Override
    public void getinfo(){
        System.out.println("IP Address : " + ipAddress);
        System.out.println("CPU Clock : " + cpuClock);
        System.out.println("Memory : " + memory);
        System.out.println("Storage : " + storage);  
        System.out.println("Batt Capacity : " + battCapacity); 
    }
}
