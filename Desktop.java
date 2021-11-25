public class Desktop extends Computer implements WiFi {
    public int battCapacity;

    @Override
    public void sendData() {
        System.out.println("Desktop sending data via WiFi");
        
    }

    @Override
    public void getInfo() {
        System.out.println("Desktop");
        System.out.println("IP address: " + ipAddress);
        System.out.println("CPU Clock: " + cpuClock);
        System.out.println("Memory: " + memory);
        System.out.println("Storage: " + storage);
        System.out.println("Battery capacity: " + battCapacity);
        
    }
    
}
