package jti.polinema.kuis2.praktikum;
/**
 * Nama      : Rofika Nur 'Aini
 * NIM       : 2041720099
 * No. Absen : 24
 * Kelas     : 2B
 **/
public class Drone implements WiFi, Radio{
    public int maxSpeed;
    public int maxAltitude;
    public double freq;
    
    public Drone(){}
    public Drone(int maxSpeed, int maxAltitude, double freq){
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
        this.freq = freq;
    }
    public void info(){
        System.out.println("Drone");
        System.out.println("Max Speed     : "+this.maxSpeed +" mph");
        System.out.println("Max Altitude  : "+this.maxAltitude+" feet");
    }
    @Override
    public void sendData() {
        System.out.println("Frequencies   : "+this.freq +" GHz");
    }

    @Override
    public void sendSignal() {
        System.out.println("This device uses radio signals");
    }
}
