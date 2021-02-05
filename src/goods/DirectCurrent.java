/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goods;

public class DirectCurrent extends Electronics {
    private String plugType;

    public DirectCurrent(String name) {
        super(name);
    }

    public String getPlugType() {
        return plugType;
    }

    public void setPlugType(String plugType) {
        this.plugType = plugType;
    }
    
}
