/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Operator {
    public void wifiControl(Wifi wifi) {
        wifi.sendData();
    }
    public void radioControl(Radio radio) {
        radio.sendSignal();
    }
}
