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
public class Operator {
    public void wifiControl(Wifi wifi) {
        System.out.println("Operator mengontrol Wifi");
        wifi.sendData();
    }

    public void radioControl(Radio radio) {
        System.out.println("Operator mengontrol radio");
        radio.sendSignal();
    }
}