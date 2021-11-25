/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author ALIFIYUL
 */
public class Desktop extends Computer implements Wifi{
    public int battCapacity;
    
    @Override
    public void sendData(){
        System.out.println("-> Data dikirim dari Desktop melalui Wifi");
    }
    
    @Override
    public void getInfo(){
        System.out.println("Desktop");
        System.out.println("ip address : "+ipAddress);
        System.out.println("memory : "+memory);
        System.out.println("cpu clock : "+ cpuClock);
        System.out.println("storage : "+storage);
        System.out.println("kapasitas baterai : "+battCapacity);
    }
}
