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
public class Drone implements IWifi, IRadio{
    public int maxSpeed, maxAltitude;
    
    @Override
    public void sendData() {
        System.out.println("Drone Mengirimkan Data");
    }

    @Override
    public void sendSinyal() {
        System.out.println("Drone Mengirimkan Sinyal");
    }
    
}
