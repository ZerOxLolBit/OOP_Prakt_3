//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package components.builders;

import components.Motherboard;

public class MotherboardBuilder {
  private String model;
  private String socketType;
  private int ramCountSlot;
  private double price;

  public MotherboardBuilder(String model) {
    this.model = model;
  }

  public MotherboardBuilder socketType(String socketType) {
    this.socketType = socketType;
    return this;
  }

  public MotherboardBuilder ramCountSlot(int ramCountSlot) {
    this.ramCountSlot = ramCountSlot;
    return this;
  }

  public MotherboardBuilder price(double price) {
    this.price = price;
    return this;
  }

  public Motherboard build() {
    if (this.model != null && !this.model.isEmpty()) {
      return new Motherboard(this.model, this.socketType, this.ramCountSlot, this.price);
    } else {
      throw new RuntimeException("Model is a required field and cannot be null or empty");
    }
  }
}
