package abstractclass.kuis2;
public class RaspberryPi extends Computer implements Wifi,Radio{
    public int numSocket;
    public RaspberryPi(String ipAddres, int cpuClock, int memory, int storage, int numSocket){
        super(ipAddres, cpuClock, memory, storage);
        this.numSocket=numSocket;
    }
    public void sendData(){
        getInfo();
        System.out.println("Num Socket : "+numSocket);
        System.out.println("RaspberryPi berhasil mengirim data");
    }
    public void sendSignal(){
        System.out.println("RaspberryPi Mengirim Sinyal");
    }
}
