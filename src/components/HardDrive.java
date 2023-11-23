//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package components;

public class HardDrive {
  private String model;
  private int capacityGB;
  private double price;

  public HardDrive(String model, int capacityGB, double price) {
    this.model = model;
    this.capacityGB = capacityGB;
    this.price = price;
  }

  public String getModel() {
    return this.model;
  }

  public int getCapacityGB() {
    return this.capacityGB;
  }

  public double getPrice() {
    return this.price;
  }
}
