//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package components.builders;

import components.RAM;

public class RAMBuilder {
  private String model;
  private int capacityGB;
  private int speedMHz;
  private double price;

  public RAMBuilder(String model) {
    this.model = model;
  }

  public RAMBuilder capacityGB(int capacityGB) {
    this.capacityGB = capacityGB;
    return this;
  }

  public RAMBuilder speedMHz(int speedMHz) {
    this.speedMHz = speedMHz;
    return this;
  }

  public RAMBuilder price(double price) {
    this.price = price;
    return this;
  }

  public RAM build() {
    if (this.model != null && !this.model.isEmpty()) {
      return new RAM(this.model, this.capacityGB, this.speedMHz, this.price);
    } else {
      throw new RuntimeException("Model is a required field and cannot be null or empty");
    }
  }
}
