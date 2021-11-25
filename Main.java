/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args){
        Desktop d = new Desktop();
        d.ipAddress = "192.168.3.1";
        d.cpuClock = 2250;
        d.memory = 8;
        d.storage = 500;
        d.battCapacity = 10000;
        Operator od = new Operator();
        
        System.out.println("Desktop");
        od.wifiControl(d);
        d.getInfo();
        System.out.println("==========================================");
        
        RaspberryPi r = new RaspberryPi();
        r.ipAddress = "192.168.100.1";
        r.cpuClock = 1250;
        r.memory = 4;
        r.storage = 256;
        r.numSocket = 25591;
        Operator or = new Operator();
        
        System.out.println("RaspberryPi");
        or.wifiControl(r);
        or.radioControl(r);
        r.getInfo();
        System.out.println("==========================================");
        
        Drone dr = new Drone();
        dr.maxSpeed = 25;
        dr.maxAltitude = 250;
        Operator odr = new Operator();
        
        System.out.println("Drone");
        odr.wifiControl(dr);
        odr.radioControl(dr);
        System.out.println("Kecepatan Maksimal  : "+dr.maxSpeed+" Kmh");
        System.out.println("Ketinggian Maksimal : "+dr.maxAltitude+" M");
        System.out.println("==========================================");
    }
}
