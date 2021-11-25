package Kuis2;

public class RaspberryPi extends Computer implements IWifi, IRadio{
    public int numSocket;

    public void sendData(){
        System.out.println("        Rasperbery");
        System.out.println("Ip address      : " + ipAddress);
        System.out.println("CPU Clock       : " + cpuClock + " Hz");
        System.out.println("Memory          : " + memory + " GB");
        System.out.println("Storage         : " + storage + " Mb");
        System.out.println("Socket(s)       : " + numSocket);
    }

    public void sendSignal(){
        System.out.println("        Rasperbery");
        System.out.println("Ip address      : " + ipAddress);
        System.out.println("CPU Clock       : " + cpuClock + " Hz");
        System.out.println("Memory          : " + memory + " GB");
        System.out.println("Storage         : " + storage + " Mb");
        System.out.println("Socket(s)       : " + numSocket);
    }

    @Override
    public void getInfo() {

    }
}
