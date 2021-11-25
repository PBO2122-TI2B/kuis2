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
public class Program {
    public static void main (String[]args){
        
        Desktop dp = new Desktop();
        dp.cpuClock = 4578;
        dp.memory = 10;
        dp.storage = 256;
        dp.ipAddress = "167.495.988.12";
        dp.battCapacity = 5167;
        
        Drone dr = new Drone();
        dr.maxAltitude = 70;
        dr.maxSpeed = 155;

        RaspberryPi rp = new RaspberryPi();
        rp.ipAddress = "360.223.88.142";
        rp.cpuClock = 4567;
        rp.memory = 4;
        rp.storage = 130;
        rp.numSocket = 6;
        
        System.out.println();
        System.out.println("----- Desktop -----");
        dp.getinfo();
        Operator odp = new Operator();
        odp.wifiControl(dp);
        System.out.println();

        System.out.println("----- Drone -----");
        Operator odr = new Operator();
        odr.radioControl(dr);
        odr.wifiControl(dr);
        System.out.println();

        System.out.println("----- Raspberry Pi -----");
        rp.getinfo();
        Operator orp = new Operator();
        orp.radioControl(rp);
        orp.wifiControl(rp);
        
    }
}
