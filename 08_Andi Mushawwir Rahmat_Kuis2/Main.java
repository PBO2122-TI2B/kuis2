public class Main {
    public static void main(String[] args) {
        Dekstop dk = new Dekstop();
        RaspberryPi rp = new RaspberryPi();
        Drone dji = new Drone();
        Operator op = new Operator();

        dk.ipAddress = "192.8.121";
        dk.cpuClock = 1231;
        dk.memory = 2056;
        dk.storage = 2343;
        dk.battCapacity = 2076;

        rp.ipAddress = "192.8.130";
        rp.cpuClock = 1231;
        rp.memory = 2056;
        rp.storage = 2343;
        rp.numSocker = 8;

        op.radioControl(rp);
        op.wifiControl(rp);
        rp.tampilkanInfo();

        op.wifiControl(dk);
        dk.tampilkanInfo();

        op.wifiControl(dji);
        op.radioControl(dji);
    }
}
