package Kuis2;

public class MainClass {
    public static void main(String[] args){
        Dekstop dp = new Dekstop("192.168.1.0", 3, 4, 6, 3500);
        RaspberryPi rp = new RaspberryPi("192.168.0.0", 3, 4, 6, 1024);
        Drone dr = new Drone(40, 5000);
        Operator op = new Operator();

        dp.getInfo();
        op.wifiControl(dp);
        System.out.println("");

        rp.getInfo();
        op.wifiControl(rp);
        op.radioControl(rp);
        System.out.println("");

        dr.displayData();
        op.wifiControl(dr);
        op.radioControl(dr);
        System.out.println("");
    }
}
