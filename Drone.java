/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author ALIFIYUL
 */
public class Drone implements Wifi, Radio{
    public int maxSpeed;
    public int maxAltitude;
    
    @Override
    public void sendSignal(){
        System.out.println("-> Sinyal dikirim dari Drone melalui Radio");
    }
    
    @Override
    public void sendData(){
        System.out.println("-> Data dikirim dari Drone melalui Wifi");
    }
}

