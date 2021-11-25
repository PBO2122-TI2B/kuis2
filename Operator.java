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
public class Operator {
    public void wifiControl(Wifi wifi){
        System.out.println("-> Wifi dikontrol oleh operator");
        wifi.sendData();
    }
    public void radioControl(Radio radio){
        System.out.println("-> Radio dikontrol oleh operator");
        radio.sendSignal();
    }
}
