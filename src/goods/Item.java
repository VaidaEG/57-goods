
package goods;

public class Item {
    private String name;
    private int code;
    private double price;
    private static int codeGenerator = 0;
    private double discount; // 0 =< discount > 1 

    public Item(String name) {
        codeGenerator++;
        this.name = name;
        this.code = codeGenerator;
        this.price = 0;
        this.discount = 0;
    }
    
    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }
    
    public double getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setPrice(double price) {
        this.price = price;
    }
  
    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
