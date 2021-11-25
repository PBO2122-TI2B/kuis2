public class Operator {
    public void wifiControl(WiFi wifi) {
        System.out.println("Operator is controlling WiFi");
        wifi.sendData();
    }

    public void radioControl(Radio radio) {
        System.out.println("Operator is controlling Radio");
        radio.sendSignal();
    }
}
