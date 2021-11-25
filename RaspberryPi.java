public class RaspberryPi extends Computer implements WiFi, Radio {
    public int numSocket;

    @Override
    public void sendSignal() {
        System.out.println("Raspberry Pi is sending signal via Radio");
        
    }

    @Override
    public void sendData() {
        System.out.println("Raspberry Pi is sending data via WiFi");
    }

    @Override
    public void getInfo() {
        System.out.println("Raspberry Pi");
        System.out.println("IP address: " + ipAddress);
        System.out.println("CPU Clock: " + cpuClock);
        System.out.println("Memory: " + memory);
        System.out.println("Storage: " + storage);
        System.out.println("Ammount of socket: " + numSocket);
    }
    
}
