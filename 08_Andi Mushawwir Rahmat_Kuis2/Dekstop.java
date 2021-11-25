public class Dekstop extends Computer implements Wifi {
    public int battCapacity;

    public void sendData() {
        System.out.println("=============================");
        System.out.println("Controlling Dekstop via Wifi ");
        System.out.println();
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("-----Dekstop-----");
        System.out.println("ipAddress : " + ipAddress);
        System.out.println("cpuClock : " + cpuClock);
        System.out.println("Memory : " + memory);
        System.out.println("Storage : " + storage);
        System.out.println("Battery : " + battCapacity);
    }
}
