public class RaspberryPi extends Computer implements Wifi, Radio{
    public int numSocket;

    RaspberryPi(String ipAddress, int cpuClock, int memory, int storage, int numSocket) {
        super(ipAddress, cpuClock, memory, storage);
        this.numSocket = numSocket;
    }

    @Override
    public void getInfo() {
        System.out.println("-- Informasi Detail Komputer --");
        System.out.println("IpAddress        : " + ipAddress);
        System.out.println("CPU Clock        : " + cpuClock + " Ghz");
        System.out.println("Memory           : " + memory + " Gb");
        System.out.println("Storage          : " + storage + " Gb");
    }

    @Override
    public void sendData() {
        System.out.println("-- Informasi RaspberryPi --");
        System.out.println("Num Socket       : " + numSocket);
        System.out.println("Sedang mengontrol RaspberryPi via WIFI....");
    }

    @Override
    public void sendSignal() {
        System.out.println("-- Informasi RaspberryPi --");
        System.out.println("Num Socket       : " + numSocket);
        System.out.println("Sedang mengontrol RaspberryPi via Radio....");
    }
}
