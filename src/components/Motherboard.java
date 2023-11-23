//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package components;

public class Motherboard {
  private String model;
  private String socketType;
  private int ramCountSlot;
  private double price;

  public Motherboard(String model, String socketType, int ramCountSlot, double price) {
    this.model = model;
    this.socketType = socketType;
    this.ramCountSlot = ramCountSlot;
    this.price = price;
  }

  public String getModel() {
    return this.model;
  }

  public String getSocketType() {
    return this.socketType;
  }

  public double getPrice() {
    return this.price;
  }

  public int getRamCountSlot() {
    return this.ramCountSlot;
  }
}
