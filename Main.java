package jti.polinema.kuis2.praktikum;
/**
 * Nama      : Rofika Nur 'Aini
 * NIM       : 2041720099
 * No. Absen : 24
 * Kelas     : 2B
 **/
public class Main {
    public static void main(String[] args){
        Operator o = new Operator();
        System.out.println("-------------------------------");
        //instance object dekstop
        Dekstop d = new Dekstop("192.168.1.45", 4, 16, 1000, 6000, 5);
        d.getInfo();
        o.wifiControl(d);
        System.out.println("-------------------------------");
        //instance object RaspberryPi
        RaspberryPi r = new RaspberryPi("192.168.1.179", 2, 8, 32, 3400, 3);
        r.getInfo();
        o.wifiControl(r);
        o.radioControl(r);
        System.out.println("-------------------------------");
        Drone dr = new Drone(200, 400, 5);
        dr.info();
        o.wifiControl(dr);
        o.radioControl(dr);
        System.out.println("-------------------------------");
    }
}
