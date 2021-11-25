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
public class Desktop extends Computer implements Wifi{

   public int battCapacity;

    @Override
    public void sendData() {
       System.out.println("Desktop mengirim data menggunakan Wifi");
    }
    @Override
   public void getinfo(){
        System.out.println("IP Adress : " + ipAddress);
        System.out.println("CPU Clock : " + cpuClock);
        System.out.println("Memory : " + memory);
        System.out.println("Storage : " + storage);  
        System.out.println("Batt Capacity : " + battCapacity); 
   }
    
}
