public class Dekstop extends Computer implements Wifi {
    public int battCapacity = 230;
    
    public void sendData(){
        System.out.println("Dekstop via Wifi");
        System.out.println("Kapasistas Baterai: " + battCapacity);
        super.getInfo();
    } 
    
}
