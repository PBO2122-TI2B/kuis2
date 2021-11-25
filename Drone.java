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
public class Drone implements WiFi, Radio {
    public int maxSpeed;
    public int maxAltitude;
    
    public Drone(int maxSpeed, int maxAltitude){
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
    }

    Drone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sendData() {
       System.out.println("Drone mengirim data menggunakan WiFi");
    }

    @Override
    public void sendSignal() {
        System.out.println("Drone mengirim sinyal lewat Radio");
    }
}
