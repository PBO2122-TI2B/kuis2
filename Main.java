package Kuis2;

public class Main {
    public static void main(String[] args) {

        Dekstop dekstop = new Dekstop();
        dekstop.ipAddress = "224.0.0.0";
        dekstop.cpuClock = 3;
        dekstop.memory = 8;
        dekstop.storage = 16;
        dekstop.battCapacity = 1200;
        System.out.println();

        RaspberryPi Raspberry1 = new RaspberryPi();
        Raspberry1.ipAddress = "192.0.0.0";
        Raspberry1.cpuClock = 2;
        Raspberry1.memory = 4;
        Raspberry1.storage = 2;
        Raspberry1.numSocket = 6;

        RaspberryPi Raspberry2 = new RaspberryPi();
        Raspberry2.ipAddress = "127.0.0.0";
        Raspberry2.cpuClock = 4;
        Raspberry2.memory = 8;
        Raspberry2.storage = 8;
        Raspberry2.numSocket = 4;

        Drone drone1 = new Drone();
        drone1.maxSpeed = 163;
        drone1.maxAltitude = 700;

        Drone drone2 = new Drone();
        drone2.maxSpeed = 125;
        drone2.maxAltitude = 400;

        Operator op = new Operator();

        op.wifiControl(dekstop);
        System.out.println();

        op.wifiControl(Raspberry1);
        op.radioControl(Raspberry2);

        System.out.println();

        op.wifiControl(drone1);
        op.radioControl(drone2);

    }
}
