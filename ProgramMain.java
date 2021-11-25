/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author LENOVO
 */
public class ProgramMain {
    public static void main(String args[]) {
        Desktop ds = new Desktop();
        ds.cpuClock = 2913;
        ds.memory = 16;
        ds.storage = 1000;
        ds.ipAddress = "109.253.329.25";
        ds.battCapacity = 4321;
        
        System.out.println();
        System.out.println("=== DESKTOP ===");
        ds.getinfo();
        Operator op = new Operator();
        op.wifiControl(ds);
        System.out.println();

        Drone dr = new Drone();
        dr.maxAltitude = 55;
        dr.maxSpeed = 200;
        
        System.out.println("=== DRONE ===");
        Operator op2 = new Operator();
        op2.radioControl(dr);
        op2.wifiControl(dr);
        System.out.println();

        RaspberryPi rp = new RaspberryPi();
        rp.ipAddress = "158.329.214.92";
        rp.cpuClock = 2735;
        rp.memory = 8;
        rp.storage = 500;
        rp.numSocket = 9;
        
        System.out.println("=== RASPBERRYPI ===");
        rp.getinfo();
        Operator op3 = new Operator();
        op3.radioControl(rp);
        op3.wifiControl(rp);
    }
}
