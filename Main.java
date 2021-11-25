/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author ALIFIYUL
 */
public class Main {
    public static void main(String[] args) {
        Desktop dsk=new Desktop();
        dsk.battCapacity=1735;
        dsk.memory= 20;
        dsk.cpuClock=2500;
        dsk.storage=255;
        dsk.ipAddress="172.255.200.12";
        
        RaspberryPi rspPi=new RaspberryPi();
        rspPi.ipAddress="245.46.100.132";
        rspPi.memory= 10;
        rspPi.cpuClock=1500;
        rspPi.storage=125;
        rspPi.numSocket=3;
        
        Drone drn=new Drone();
        drn.maxAltitude=70;
        drn.maxSpeed=200;
        
        System.out.println();
        System.out.println("----------Raspberry Pi----------");
        Operator operatorRaspberry =new Operator();
        operatorRaspberry.radioControl(rspPi);
        operatorRaspberry.wifiControl(rspPi);
        System.out.println();
        System.out.println("Info Raspberry Pi");
        rspPi.getInfo();
        
        System.out.println();
        System.out.println("----------Desktop----------");
        Operator operatorDesktop=new Operator();
        operatorDesktop.wifiControl(dsk);
        System.out.println();
        System.out.println("Info Dekstop");
        dsk.getInfo();
        
        System.out.println();
        System.out.println("----------Drone----------");
        Operator operatorDrone=new Operator();
        operatorDrone.radioControl(drn);
        operatorDrone.wifiControl(drn);
    }
       
    }
        