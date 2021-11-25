package Kuis2;

public class Operator {

    public void wifiControl(Wifi wifi){
        System.out.print("Operator Wifi   ");
        wifi.sendData();
    }
    public void radioControl(Radio radio){
        System.out.print("Operator Radio  ");
        radio.sendSignal();
    }
}
