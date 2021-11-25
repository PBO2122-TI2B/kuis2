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
public class Drone implements Wifi,Radio{
    public int maxSpeed ;
    public int maxAltitude ;

    public Drone(int maxSpeed, int maxAltitude) {
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void sendData() {
        System.out.println("MAX SPEED       : " + this.maxSpeed);
    }

    @Override
    public void sendSignal() {
        System.out.println("MAX ALTITUDE    : " + this.maxAltitude);
    }
    
}

