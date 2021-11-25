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
public class Drone implements Wifi, Radio {
    public int maxSpeed;
    public int maxAltitude;
    
    @Override
    public void sendData() {
       System.out.println("Drone mengirim data menggunakan Wifi");
    }

    @Override
    public void sendSignal() {
        System.out.println("Drone mengirim sinyal lewat Radio");
    }
    
}
