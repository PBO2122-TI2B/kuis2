public class RaspberryPi extends Computer implements Wifi, Radio{
    public int numSocket;

    RaspberryPi(String ipAddress, int cpuClock, int memory, int storage, int numSocket) {
        super(ipAddress, cpuClock, memory, storage);
        this.numSocket = numSocket;
    }

    @Override
    public void sendData() {
        super.getInfo();
        System.out.println("-- Informasi RaspberryPi --");
        System.out.println("Num Socket       : " + numSocket);
        System.out.println("Sedang mengontrol RaspberryPi via WIFI....");
    }

    @Override
    public void sendSignal() {
        super.getInfo();
        System.out.println("-- Informasi RaspberryPi --");
        System.out.println("Num Socket       : " + numSocket);
        System.out.println("Sedang mengontrol RaspberryPi via Radio....");
    }
}
