
package goods;

public class Goods {

    public static void main(String[] args) {
        Chargable dulkiuSiurblys = new Chargable("samsung siurblys");
        DirectCurrent indaplove = new DirectCurrent("wirpool indaplove");
        System.out.println("0000000" + dulkiuSiurblys.getCode());
        System.out.println("0000000" + indaplove.getCode());
        dulkiuSiurblys.setBatteryType("lithium");
        dulkiuSiurblys.setChargeTime(50);
        dulkiuSiurblys.setLifeTime(45);
        dulkiuSiurblys.setWatts(200);
        dulkiuSiurblys.setVoltage(24);
        dulkiuSiurblys.setPrice(340);
        // save to db
        
        System.out.println(dulkiuSiurblys.getClass());
        System.out.println(dulkiuSiurblys.getClass().getSuperclass().getName());
        indaplove.setPlugType("EU");
    }
}
