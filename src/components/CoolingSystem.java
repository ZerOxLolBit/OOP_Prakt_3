//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package components;

public class CoolingSystem {
  private final String model;
  private final String type;
  private final int fanSpeed;
  private final int price;

  public CoolingSystem(String model, String type, int fanSpeed, int price) {
    this.model = model;
    this.type = type;
    this.fanSpeed = fanSpeed;
    this.price = price;
  }

  public String getModel() {
    return this.model;
  }

  public String getType() {
    return this.type;
  }

  public int getFanSpeed() {
    return this.fanSpeed;
  }

  public int getPrice() {
    return this.price;
  }
}
