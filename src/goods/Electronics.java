/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goods;

public class Electronics extends Item {
    private double voltage;
    private double watts;

    public Electronics(String name) {
        super(name);
    }
    public double getVoltage() {
        return voltage;
    }

    public double getWatts() {
        return watts;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public void setWatts(double watts) {
        this.watts = watts;
    } 
}
