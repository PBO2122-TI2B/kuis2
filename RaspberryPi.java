public class RaspberryPi extends Computer implements Wifi, Radio {
    public int numSocket;

    public void sendData() {
        System.out.println("RaspberryPi dikontrol dengan Wifi");
        System.out.println("-----------------------------");
    }

    public void sendSignal() {
        System.out.println("RaspberryPi dikontrol dengan Radio");
        System.out.println("-----------------------------");
    }

    public void getInfoR(int numSocket){
        this.numSocket=numSocket;
        System.out.println("numSocket : " + numSocket + "mAh");
    }
}
