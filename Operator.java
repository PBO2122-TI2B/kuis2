package Kuis2;

public class Operator {

    public void wifiControl(IWifi wifi){
        System.out.println("Operator sedang mengatur Control Wifi");

        wifi.sendData();
        System.out.println("--------------------------------------------");
    }

    public void radioControl(IRadio radio){
        System.out.println("Operator sedang mengatur Control Radio");
        radio.sendSignal();
        System.out.println("--------------------------------------------");
    }
}
