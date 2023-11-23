
package components.builders;

import components.CoolingSystem;

public class CoolingSystemBuilder {
  private final String model;
  private String type;
  private int fanSpeed;
  private int price;

  public CoolingSystemBuilder(String model) {
    this.model = model;
  }

  public CoolingSystemBuilder type(String type) {
    this.type = type;
    return this;
  }

  public CoolingSystemBuilder fanSpeed(int fanSpeed) {
    this.fanSpeed = fanSpeed;
    return this;
  }

  public CoolingSystemBuilder price(int price) {
    this.price = price;
    return this;
  }

  public CoolingSystem build() {
    return new CoolingSystem(this.model, this.type, this.fanSpeed, this.price);
  }
}
