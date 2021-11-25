package kuis2;
public abstract class Computer {
    public String ipAddress;
    public int cpuClock, memory, storage;
    Computer(String ipAddress, int cpuClock, int memory, int storage){
        this.ipAddress = ipAddress;
        this.cpuClock = cpuClock;
        this.memory = memory;
        this.storage = storage;
    }
    public abstract void getInfo();
}
public interface WiFi {
    public void sendData();
}
public interface Radio {
    public void sendSignal();
}
public class Desktop extends Computer implements WiFi{
    public int battCapacity;
    public Desktop(String ipAddress, int cpuClock, int memory, int storage, int battCapacity){
        super(ipAddress, cpuClock, memory, storage);
        this.battCapacity = battCapacity;
    }
    @Override
    public void getInfo() {
        System.out.println("Desktop Computer");
        System.out.println("IP Address       : "+super.ipAddress);
        System.out.println("CPU Clock        : "+super.cpuClock);
        System.out.println("Memory           : "+super.memory);
        System.out.println("Storage          : "+super.storage);
        System.out.println("Battery Capacity : "+this.battCapacity);
    }
    @Override
    public void sendData() {
        System.out.println("File on Desktop Computer sent by WiFi");   
    }
}
public class RaspberryPi extends Computer implements WiFi, Radio{
    public int numSocket;
    public RaspberryPi(String ipAddress, int cpuClock, int memory, int storage, int numSocket){
        super(ipAddress, cpuClock, memory, storage);
        this.numSocket = numSocket;
    }
    @Override
    public void getInfo() {
        System.out.println("Small Single-Board Computers");
        System.out.println("IP Address       : "+super.ipAddress);
        System.out.println("CPU Clock        : "+super.cpuClock);
        System.out.println("Memory           : "+super.memory);
        System.out.println("Storage          : "+super.storage);
        System.out.println("Battery Capacity : "+this.numSocket);
    }
    @Override
    public void sendData() {
        System.out.println("File on RaspberryPi sent by WiFi");
    }
    @Override
    public void sendSignal() {
        System.out.println("RaspberryPi sends a signal with radio");
    }
}
public class Drone implements WiFi, Radio{
    public int maxSpeed, maxAltitude;
    public Drone(int maxSpeed, int maxAltitude){
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
    }
    public  void info(){
        System.out.println("Drone");
        System.out.println("Max Speed        : "+this.maxSpeed);
        System.out.println("Max Altitude     : "+this.maxAltitude);
    }
    @Override
    public void sendData() {
        System.out.println("File on Drone sent by WiFi");
    }
    @Override
    public void sendSignal() {
        System.out.println("Drone sends a signal with radio");
    } 
}
public class Operator {
    public void wifiControl(WiFi wifi){
        System.out.println("Controlling via WiFi");
        wifi.sendData();
    }
    public void radioControl(Radio radio){
        System.out.println("Controlling via WiFi");
        radio.sendSignal();
    }
}
public class Main {
    public static void main(String[] args) {
        Desktop samsung = new Desktop("10.127.127.1",10,1000,2000000,6000);
        RaspberryPi zero2 = new RaspberryPi("88.123.123.5",15,2000,3000000,4000);
        Drone parrot = new Drone(2000,7368);
        Operator op = new Operator();
        
        System.out.println("Spesifikasi : ");
        System.out.println("");
        samsung.getInfo();
        System.out.println("");
        zero2.getInfo();
        System.out.println("");
        parrot.info();
        System.out.println("");
        System.out.println("Operator    : ");
        op.wifiControl(samsung);
        op.wifiControl(zero2);
        op.wifiControl(parrot);
        op.radioControl(zero2);
        op.radioControl(parrot);
    }
}
