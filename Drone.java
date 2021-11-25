/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Drone implements Wifi ,Radio {
    public int maxSpeed;
    public int Altitude;

    @Override
    public void sendData() {
       System.out.println ("Drone sedang mengirim data menggunakan wifi");
    }

    @Override
    public void sendSignal() {
        System.out.println ("Drone sedang menerima sinyal dari Radio");
        
    }

    
}
