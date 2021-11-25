/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author LENOVO
 */
public class Operator {
    public void wifiControl(WiFi wifi) {
        System.out.println("--- Operator mengontrol WiFi ---");
        wifi.sendData();
    }

    public void radioControl(Radio radio) {
        System.out.println("--- Operator mengontrol Radio ---");
        radio.sendSignal();
    }
}
