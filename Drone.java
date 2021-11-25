/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identifier.relasiclass.interfacelat.Kuis2;

/**
 *
 * @author Aku
 */
public class Drone implements Wifi, Radio{

    public int maxSpeed, maxAltitude;
    
    @Override
    public void sendData() {
        System.out.println("Mengirim data dengan kecepatan : "+ maxSpeed +" MB/s dari Drone");
    }

    @Override
    public void sendSignal() {
        System.out.println("Mengirim Signal sebesar : "+maxAltitude+" dari Drone");
    }
    
}
