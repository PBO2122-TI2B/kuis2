package Kuis2;

public class Dekstop extends Computer implements IWifi{
    public int battCapacity;

    public void sendData(){
        System.out.println("-----Mengirim Data Ke Komputer-----");
        System.out.println("        Data Dekstop");
        System.out.println("Ip address      : " + ipAddress);
        System.out.println("CPU Clock       : " + cpuClock + " Hz");
        System.out.println("Memory          : " + memory + " GB");
        System.out.println("Storage         : " + storage + "Mb");
        System.out.println("Battery Capacity: " + this.battCapacity + " Wh");
    }

    @Override
    public void getInfo() {

    }
}
