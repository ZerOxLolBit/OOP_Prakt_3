//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package components.builders;

import components.HardDrive;

public class HardDriveBuilder {
  private String model;
  private int capacityGB;
  private double price;

  public HardDriveBuilder(String model) {
    this.model = model;
  }

  public HardDriveBuilder capacityGB(int capacityGB) {
    this.capacityGB = capacityGB;
    return this;
  }

  public HardDriveBuilder price(double price) {
    this.price = price;
    return this;
  }

  public HardDrive build() {
    if (this.model != null && !this.model.isEmpty()) {
      return new HardDrive(this.model, this.capacityGB, this.price);
    } else {
      throw new RuntimeException("Model is a required field and cannot be null or empty");
    }
  }
}
