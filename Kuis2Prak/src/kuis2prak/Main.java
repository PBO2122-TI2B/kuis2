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
 public class Main {
    public static void main(String[] args) {
        Dekstop d = new Dekstop(1000, "192.168.0.8", 5, 8, 256);
        RaspberryPi r = new RaspberryPi(11 , "192.168.0.1", 6, 9, 128);
        Drone dr = new Drone(60 , 20);
        Operator o = new Operator();
        
        o.wifiControl(d);
        d.getInfo();
        
        System.out.println("");
        
        o.wifiControl(r);
        o.radioControl(r);
        r.getInfo();
        
        System.out.println("");
        
        o.wifiControl(dr);
        o.radioControl(dr);
    }
}
