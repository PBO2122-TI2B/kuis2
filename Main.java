public class Main {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        desktop.battCapacity = 1825;
        desktop.cpuClock = 2350;
        desktop.memory = 16;
        desktop.storage = 256;
        desktop.ipAddress = "123.425.214.12";

        RaspberryPi raspberryPi = new RaspberryPi();
        raspberryPi.ipAddress = "240.42.124.142";
        raspberryPi.cpuClock = 1820;
        raspberryPi.memory = 8;
        raspberryPi.storage = 128;
        raspberryPi.numSocket = 4;

        Drone drone = new Drone();
        drone.maxAltitude = 50;
        drone.maxSpeed = 120;

        System.out.println("Raspberry Pi");
        Operator operatorOfRaspberry = new Operator();
        operatorOfRaspberry.radioControl(raspberryPi);
        operatorOfRaspberry.wifiControl(raspberryPi);
        System.out.println("Raspberry Pi Info");
        raspberryPi.getInfo();
        
        System.out.println();
        System.out.println("Desktop");
        Operator operatorOfDesktop = new Operator();
        operatorOfDesktop.wifiControl(desktop);
        System.out.println("Desktop Info");
        desktop.getInfo();

        System.out.println();
        System.out.println("Drone");
        Operator operatorOfDrone = new Operator();
        operatorOfDrone.radioControl(drone);
        operatorOfDrone.wifiControl(drone);
    }
}
