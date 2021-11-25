/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_PraktikumKUIS2;

/**
 *
 * @author Chaidir Wiradhika
 */
public abstract class Computer {
    protected String ipAddress;
    protected int cpuClock, memory, storage;
    
    public Computer(String ipAddress, int cpuClock, int memory, int storage){
        this.ipAddress=ipAddress;
        this.cpuClock=cpuClock;
        this.memory=memory;
        this.storage=storage;
    }
    public void setIpAddress(String ipAddress){
        this.ipAddress=ipAddress;
    }
    public void setCpuClock(int cpuClock){
        this.cpuClock=cpuClock;
    }
    public void setMemory(int memory){
        this.memory=memory;
    }
    public void setStorage(int storage){
        this.storage=storage;
    }
    public String getIpAddress(){
        return ipAddress;
    }
    public int getCpuClock(){
        return cpuClock;
    }
    public int getMemory(){
        return memory;
    }
    public int getStorage(){
        return storage;
    }
    public abstract void getInfo();
}
