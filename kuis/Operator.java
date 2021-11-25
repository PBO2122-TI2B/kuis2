package kuis;

public class Operator {

    public void wifiControl(IWifi wifi){
        System.out.println("[Wifi control]");
        wifi.sendData();

        System.out.println("---------------------------------------------");
    }
    public void radioControl(IRadio radio){
        System.out.println("[Radio control]");
        radio.sendSignal();

        System.out.println("---------------------------------------------");
    }
}
