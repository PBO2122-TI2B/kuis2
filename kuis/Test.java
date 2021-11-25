package kuis;

public class Test {
    public static void main(String[] args) {
        Operator control = new Operator();

        Desktop desktop = new Desktop("192.0.2.1", 2, 8, 500, 30000);
        RaspberryPi raspberry = new RaspberryPi("192.0.1.1", 3, 16, 1000, 4);
        Drone drone = new Drone(20, 100);

        desktop.getInfo();
        control.wifiControl(desktop);

        drone.info();
        control.radioControl(drone);
        control.wifiControl(drone);

        raspberry.getInfo();
        control.radioControl(raspberry);
        control.wifiControl(raspberry);
    }
}
