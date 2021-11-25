public class RaspberryPi extends Computer implements Wifi, Radio {
    public int numSocker;

    public void sendData(){
        System.out.println("=============================");
        System.out.println("Controlling RaspberryPi via Wifi ");
        System.out.println();
    }

    public void sendSignal(){
        System.out.println("=============================");
        System.out.println("Controlling RaspberryPi via Radio ");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("-----RaspberryPi-----");
        System.out.println("ipAddress : " + ipAddress);
        System.out.println("cpuClock : " + cpuClock);
        System.out.println("Memory : " + memory);
        System.out.println("Storage : " + storage);
        System.out.println("Socket :" + numSocker);
    }
}
