/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identifier.relasiclass.interfacelat.Kuis2;

/**
 *
 * @author Aku
 */
public abstract class Computer{
    int cpuClock, memory, storage;
    String ipAddress;
    
    void getInfo(){
        System.out.println("IP Address\t: "+ipAddress
                + "\nCPU Clock\t: "+cpuClock
                + "\nMemory\t: "+memory
                + "\nStorage\t: "+storage);
    }
}
