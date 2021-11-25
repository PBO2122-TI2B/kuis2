package abstractclass.kuis2;
public class Drone implements Wifi,Radio{
    public int maxSpeed;
    public int maxAltitude;
    public Drone(int maxSpeed,int maxAltitude){
        this.maxSpeed=maxSpeed;
        this.maxAltitude=maxAltitude;
    }
    public void sendData(){
        System.out.println("Max Speed : "+maxSpeed);
        System.out.println("Mas Altitude : "+maxAltitude);
        System.out.println("Drone berhasil mengirim data");
    }
    public void sendSignal(){
        System.out.println("RaspberryPi Mengirim Sinyal");
    }
}
