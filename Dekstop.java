/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Dekstop extends Computer implements Wifi{
  public int battCapacity;
    public Dekstop(String ipAddress, int cpuClock, int memory, int storage, int battCapacity) {
        super(ipAddress, cpuClock, memory, storage);
        this.battCapacity = battCapacity;
    }

    

    @Override
    public void getInfo() {
        System.out.println("Small Single-Board Computers");
        System.out.println("IP Address       : "+super.ipAddress);
        System.out.println("CPU Clock        : "+super.cpuClock);
        System.out.println("Memory           : "+super.memory);
        System.out.println("Storage          : "+super.storage);
        System.out.println("Battery Capacity : "+this.battCapacity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sendData() {
        System.out.println("Dekstop sedang mengirim data menggunakan wifi");; //To change body of generated methods, choose Tools | Templates.
    }
    
}
