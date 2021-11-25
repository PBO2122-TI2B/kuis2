package kuis2;

public class Main{
    public static void main(String[] args) {
        Operator op = new Operator();
        
        Desktop desktop = new Desktop("127.0.0.0", 3, 8, 512);
        op.wifiControl(desktop);
        desktop.getInfo();

        RaspberryPi raspberry = new RaspberryPi("192.168.0.115", 1, 4, 512);
        op.wifiControl(raspberry);
        op.radioControl(raspberry);
        raspberry.getInfo();
        
        Drone drone = new Drone(140, 30000);
        op.wifiControl(drone);
        op.radioControl(drone);
        drone.info();
    }
}
    