public class Operator {
    public void wifiControl(Wifi w) {
        w.sendData();
    }

    public void radioControl(Radio r) {
        r.sendSignal();
    }
}