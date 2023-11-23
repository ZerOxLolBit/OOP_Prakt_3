//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package components;

public class RAM {
  private String model;
  private int capacityGB;
  private int speedMHz;
  private double price;

  public RAM(String model, int capacityGB, int speedMHz, double price) {
    this.model = model;
    this.capacityGB = capacityGB;
    this.speedMHz = speedMHz;
    this.price = price;
  }

  public String getModel() {
    return this.model;
  }

  public int getCapacityGB() {
    return this.capacityGB;
  }

  public int getSpeedMHz() {
    return this.speedMHz;
  }

  public double getPrice() {
    return this.price;
  }
}
