//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package components;

public class PowerSupply {
  private String model;
  private int wattage;
  private double price;

  public PowerSupply(String model, int wattage, double price) {
    this.model = model;
    this.wattage = wattage;
    this.price = price;
  }

  public String getModel() {
    return this.model;
  }

  public int getWattage() {
    return this.wattage;
  }

  public double getPrice() {
    return this.price;
  }
}
