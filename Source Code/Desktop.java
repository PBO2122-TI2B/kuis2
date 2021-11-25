public class Desktop extends Computer implements Wifi {
    public int battCapacity;

    Desktop(String ipAddress, int cpuClock, int memory, int storage, int battCapacity) {
        super(ipAddress, cpuClock, memory, storage);
        this.battCapacity = battCapacity;
    }

    @Override
    public void sendData() {
        super.getInfo();
        System.out.println("-- Informasi Desktop --");
        System.out.println("Battery Capacity : " + battCapacity + " mAh");
        System.out.println("Sedang mengontrol Desktop via WIFI....");
    }
}
