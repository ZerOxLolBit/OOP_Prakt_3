//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package components.builders;

import components.PowerSupply;

public class PowerSupplyBuilder {
  private String model;
  private int wattage;
  private double price;

  public PowerSupplyBuilder(String model) {
    this.model = model;
  }

  public PowerSupplyBuilder wattage(int wattage) {
    this.wattage = wattage;
    return this;
  }

  public PowerSupplyBuilder price(double price) {
    this.price = price;
    return this;
  }

  public PowerSupply build() {
    if (this.model != null && !this.model.isEmpty()) {
      return new PowerSupply(this.model, this.wattage, this.price);
    } else {
      throw new RuntimeException("Model is a required field and cannot be null or empty");
    }
  }
}
