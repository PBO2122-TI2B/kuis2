package kuis2;

public class Operator {

    public static void wifiControl(IWiFi wifi) {
        wifi.sendData();
    }

    public static void radioControl(IRadio radio) {
        radio.sendSignal();
    }

    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        desktop.ipAddress = "12345678";
        desktop.cpuClock = 15263748;
        desktop.memory = 16;
        desktop.storage = 256;
        desktop.battCapacity = 40000;

        RaspberryPi raspberryPi = new RaspberryPi();
        raspberryPi.ipAddress = "23456789";
        raspberryPi.cpuClock = 51627384;
        raspberryPi.memory = 8;
        raspberryPi.storage = 128;
        raspberryPi.numSocket = 3000;

        Drone drone = new Drone();
        drone.maxSpeed = 60;
        drone.maxAltitude = 20;

        //desktop
        System.out.println("Desktop Info");
        desktop.getInfo();
        wifiControl(desktop);
        System.out.println();

        //raspberry
        System.out.println("RaspberryPi Info");
        raspberryPi.getInfo();
        wifiControl(raspberryPi);
        radioControl(raspberryPi);
        System.out.println();

        //drone
        System.out.println("Drone Info");
        wifiControl(drone);
        System.out.println();
        radioControl(drone);
    }
}
