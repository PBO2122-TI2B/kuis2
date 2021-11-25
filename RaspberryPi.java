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
public class RaspberryPi extends Computer implements Wifi,Radio {
    public int numSocket;

    
@Override
public void getInfo(){
    System.out.println("Raspberry Pi");
    System.out.println("ip address : "+ipAddress);
    System.out.println("memory : "+memory);
    System.out.println("cpu clock : "+ cpuClock);
    System.out.println("storage : "+storage);
    System.out.println("jumlah socket : "+numSocket);
}

    @Override
    public void sendData() {        
        System.out.println("-> Data dari Raspberry Pi dikirim melalui Wifi");
    }

    @Override
    public void sendSignal() {
        System.out.println("-> Sinyal dari Raspberry Pi dikirim melalui Radio");

    }
}

