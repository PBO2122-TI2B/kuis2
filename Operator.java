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
public class Operator {
    public void wifiControl(IWifi wifi){
        wifi.sendData();
    }
    
    public void radioControl(IRadio radio){
        radio.sendSinyal();
    }
}
