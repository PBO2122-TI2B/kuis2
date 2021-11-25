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
public class RaspberryPi extends Computer implements Wifi, Radio{
    public int numSocket;

    @Override
    public void sendData() {
        System.out.println("Raspberry Pi mengirim data menggunakan Wifi");
    }

    @Override
    public void sendSignal() {
        System.out.println("Raspberry Pi mengirim sinyal lewat Radio");
    }
   
    @Override
    public void getinfo(){
        System.out.println("IP Adress : " + ipAddress);
        System.out.println("CPU Clock : " + cpuClock);
        System.out.println("Memory : " + memory);
        System.out.println("Storage : " + storage);
        System.out.println("Number Socket : " + numSocket);
}
}