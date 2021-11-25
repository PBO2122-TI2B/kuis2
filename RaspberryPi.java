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
public class RaspberryPi extends Computer implements Wifi,Radio{

    public int numSocket;
    
    @Override
    public void sendData() {
        System.out.println("RaspberryPi mengirim Data");
        getInfo();
        System.out.println("Banyak Socket\t: "+numSocket);
    }

    @Override
    public void sendSignal() {
        System.out.println("RaspberryPi mengirim Signal ");
    }
}
