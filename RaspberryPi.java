public class RaspberryPi extends Computer implements IWiFi,IRadio{
    public int numSocket;


    RaspberryPi(String ip, int cpu, int memory, int storage, int numSocket) {
        super(ip, cpu, memory, storage);
        this.numSocket = numSocket;
    }

    @Override
    public void sendSignal() {
        System.out.println("RaspBerryPi Mengirim Sinyal Radio");
    }

    @Override
    public void sendData() {
        System.out.println("RaspBerryPi Mengirim Data menggunakan WiFi"); 
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Num Socket  : " +numSocket);
    }
}

//Adika Ahmad Hanif Nazhir