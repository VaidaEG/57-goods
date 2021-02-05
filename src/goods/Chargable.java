
package goods;

public class Chargable extends Electronics {
    private String batteryType;
    private int chargeTime;
    private int lifeTime;

    public Chargable(String name) {
        super(name);
    }
    public String getBatteryType() {
        return batteryType;
    }

    public int getChargeTime() {
        return chargeTime;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public void setChargeTime(int chargeTime) {
        this.chargeTime = chargeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }
}
