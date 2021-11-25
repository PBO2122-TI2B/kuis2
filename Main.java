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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Desktop d = new Desktop("192.168.0.10/24", 3, 8, 256, 6600);
        RaspberryPi r = new RaspberryPi("192.98.1.10", 1200, 1, 4, 14661);
        Drone dr = new Drone(140, 120);
        
        d.getInfo();
        d.sendData();
        System.out.println("");
        
        r.getInfo();
        r.sendData();
        r.sendSignal();
        System.out.println("");
        
        dr.sendData();
        dr.sendSignal();
        // TODO code application logic here
    }
    
}
