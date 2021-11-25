public class Operator {
    public void wifiControl(Wifi wifi) {
        wifi.sendData();
    }

    public void radioControl(Radio radio) {
        radio.sendSignal();
    }
}
