
import java.awt.Desktop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
  Dekstop d = new Dekstop("27.132.143.1", 16,1500,2430000,1200);
  rasberryPi r = new rasberryPi("27.127.111.0", 10,1500,234000,5000);
  Drone dd = new Drone();
  dd.maxSpeed= 100;
  dd.Altitude=300;
  Operator Operator = new Operator();
  
  System.out.println("Spesifikasi :");
  System.out.println("DEKSTOP");
  d.getInfo();
  System.out.println("RasberryIP");
  r.getInfo();
  System.out.println("DRONE");
 // Operator operatorofDesktop = new Operator();
  Operator.radioControl(dd);
  Operator.wifiControl(dd);
  Operator.wifiControl(r);
  Operator.wifiControl(d);
  Operator.radioControl(r);
  
}

    
}
