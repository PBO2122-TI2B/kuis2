package abstractclass.kuis2;
public class Operator {
    public void wifiControl(Wifi wifi){
        System.out.println("---|Wifi Control|---");
        wifi.sendData();
        System.out.println("----------------------------------------");
    }
    public void radioControl(Radio radio){
        System.out.println("---|Radio Control|---");
        radio.sendSignal();
        System.out.println("----------------------------------------");
    }
}
