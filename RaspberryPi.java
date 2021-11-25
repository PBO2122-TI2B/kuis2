public class RaspberryPi extends Computer implements Wifi, Radio{
    public int numSocket = 6;
    
    public void sendData(){
        System.out.println("RaspberryPi via Wifi");
    }
    public void sendSignal(){
        System.out.println("RaspberryPi via Radio");
        System.out.println("Socket:");
        super.getInfo();
    }
}