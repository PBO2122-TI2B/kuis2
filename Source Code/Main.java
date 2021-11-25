public class Main {
    public static void main(String[] args) {
        Desktop msi = new Desktop("192.168.1.1", 4, 16, 512, 6000);
        RaspberryPi rasWifi = new RaspberryPi("192.168.1.2", 3, 8, 512, 4);
        RaspberryPi rasRadio = new RaspberryPi("195.118.1.3", 2, 4, 256, 2);
        Drone djiWifi = new Drone(100, 33);
        Drone djiRadio = new Drone(88, 20);
        Operator op = new Operator();

        System.out.println("--- Kontrol device melalui Wifi dan Radio ---");
        System.out.println("---------------------------------------------");
        System.out.println("Device 1");
        msi.getInfo();
        op.wifiControl(msi);
        System.out.println("---------------------------------------------");
        System.out.println("Device 2");
        rasWifi.getInfo();
        op.wifiControl(rasWifi);
        System.out.println("---------------------------------------------");
        System.out.println("Device 3");
        op.wifiControl(djiWifi);
        System.out.println("---------------------------------------------");
        System.out.println("Device 4");
        rasRadio.getInfo();
        op.radioControl(rasRadio);
        System.out.println("---------------------------------------------");
        System.out.println("Device 5");
        op.radioControl(djiRadio);
        System.out.println("---------------------------------------------");
    }
}
