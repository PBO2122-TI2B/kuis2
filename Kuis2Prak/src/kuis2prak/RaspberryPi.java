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
public class RaspberryPi extends Computer implements Wifi,Radio{
    public int numSocket ;

    public RaspberryPi(int numSocket, String ipAddress, int cpuClock, int memory, int storage) {
        super(ipAddress, cpuClock, memory, storage);
        this.numSocket = numSocket;
    }

    @Override
    public void getInfo() {
        System.out.println("IP ADDRESS      : " + super.ipAddress);
        System.out.println("CPU CLOCK       : " + super.cpuClock);
        System.out.println("MEMORY          : " + super.memory);
        System.out.println("STORAGE         : " + super.storage);
        System.out.println("SOCKET NUMBER   : " + this.numSocket);
    }

    @Override
    public void sendData() {
        System.out.println("DATA SENDED!!");
    }

    @Override
    public void sendSignal() {
        System.out.println("SIGNAL SENDED!!");
    }
    
}
