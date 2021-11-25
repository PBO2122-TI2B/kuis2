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
public class Dekstop extends Computer implements Wifi{
    int battCapacity;

    @Override
    public void sendData() {
        System.out.println("Dekstop mengirim data");
        getInfo();
        System.out.println("Battery Capacity: "+battCapacity);
    }
}
