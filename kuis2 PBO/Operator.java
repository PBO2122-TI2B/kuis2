package kuis2;

public class Operator {
    public void wifiControl(IWifi wifi){
        System.out.println("\nMengontrol via wifi...");
        wifi.sendData();
    }

    public void radioControl(IRadio radio){
        System.out.println("\nMengontrol via sinyal radio...");
        radio.sendSignal();
    }
}
