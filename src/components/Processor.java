//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package components;

public class Processor {
  private String model;
  private String typeClass;
  private double clockSpeed;
  private int cores;
  private double price;

  public Processor(String model, String typeClass, double clockSpeed, int cores, double price) {
    this.model = model;
    this.typeClass = typeClass;
    this.clockSpeed = clockSpeed;
    this.cores = cores;
    this.price = price;
  }

  public String getModel() {
    return this.model;
  }

  public String getTypeClass() {
    return this.typeClass;
  }

  public double getClockSpeed() {
    return this.clockSpeed;
  }

  public double getPrice() {
    return this.price;
  }

  public int getCores() {
    return this.cores;
  }
}
