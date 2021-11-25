public class Main {
    public static void main(String[] args){
        Dekstop dk = new Dekstop("74.110.208.65", 1, 4, 8, 60);
        RaspberryPi ra = new RaspberryPi("10.8.0.12", 700, 1, 32, 3);
        Drone dr = new Drone(60, 150);
        Operator op = new Operator();

        //Dekstop
        System.out.println("===================================================");
        System.out.println("----------------SPESIFIKASI DEKSTOP----------------");
        dk.getInfo();
        op.wifiControl(dk);

        //Raspberry PI
        System.out.println("");
        System.out.println("-------------SPESIFIKASI RASPBERRY PI--------------");
        ra.getInfo();
        op.wifiControl(ra);
        op.radioControl(ra);

        //Drone
        System.out.println("");
        System.out.println("-----------------SPESIFIKASI DRONE-----------------");
        dr.getInfo2();
        op.wifiControl(dr);
        op.radioControl(dr);
        System.out.println("===================================================");
    }
}
