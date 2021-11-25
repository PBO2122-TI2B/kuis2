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
public abstract class Computer {
    public String ipAddress;
    public int memory;
    public int cpuClock;
    public int storage;
    
    public Computer(){}
        public Computer(String ipAddress, int memory, int cpuClock, int storage){
            this.ipAddress=ipAddress;
            this.memory=memory;
            this.cpuClock=cpuClock;
            this.storage=storage;
        }
        public abstract void getInfo();
    }

